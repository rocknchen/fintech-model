package com.hthk.fintech.serialize.impl;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.Event;
import com.hthk.fintech.enumration.EventGroupEnum;
import com.hthk.fintech.exception.DeserializeException;
import com.hthk.fintech.exception.ServiceException;
import com.hthk.fintech.model.event.IEvent;
import com.hthk.fintech.model.event.basic.AbstractEvent;
import com.hthk.fintech.serialize.ModelDeserializeController;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.hthk.fintech.config.FintechStaticData.*;

public class IEventDeserializeController implements ModelDeserializeController<IEvent> {

    @Override
    public IEvent process(List<String> headerList, List<String> fieldList) throws DeserializeException {

        String keyGroupName = getKeyGroupName();
        int keyHeaderIndex = getKeyHeaderIndex(headerList, keyGroupName);

        String groupName = null;
        try {
            groupName = fieldList.get(keyHeaderIndex);
        } catch (Exception e) {
            String errMsg =
                    headerList.stream().collect(Collectors.joining(",")) + "\r\n"
                            + fieldList.stream().collect(Collectors.joining(",")) + "\r\n"
                            + e.getMessage();
            throw new DeserializeException(errMsg, e);
        }

        EventGroupEnum eventGroup = getGroup(groupName);

        Reflections reflections = new Reflections(new ConfigurationBuilder().forPackages(DEFAULT_PACKAGE));
        Set<Class<? extends IEvent>> eventClzSet = reflections.getSubTypesOf(IEvent.class);
        List<Class<? extends IEvent>> clzList = eventClzSet.stream().collect(Collectors.toList());
        clzList = filterOutAbstract(clzList);
        Map<EventGroupEnum, Class<? extends IEvent>> eventClzMap = buildMap(clzList);

        Class<? extends IEvent> eventClz = eventClzMap.get(eventGroup);
        Method newInstanceMethod = getInstanceBuildMethod(eventClz);

        Object eventModelTemplate = getEventModel(eventClz);
        IEvent eventModel = buildEventModel(newInstanceMethod, eventModelTemplate, fieldList);
        return eventModel;
    }

    private List<Class<? extends IEvent>> filterOutAbstract(List<Class<? extends IEvent>> clzList) {
        return clzList.stream().filter(t -> !t.getSimpleName().equals("AbstractEvent")).collect(Collectors.toList());
    }

    /**
     * TODO
     */
    private IEvent buildEventModel(Method newInstanceMethod, Object eventModelTemplate, List<String> fieldList) throws DeserializeException {

        String id = fieldList.get(0);
        String domain = fieldList.get(1);
        String type = fieldList.get(3);
        String subType = fieldList.get(4);
        String supplementary1 = fieldList.get(5);
        String supplementary2 = fieldList.get(6);
        String supplementary3 = fieldList.get(7);
        String time = fieldList.get(8);

        try {
            IEvent event = (IEvent) newInstanceMethod.invoke(eventModelTemplate, domain, type, subType, time, supplementary1, supplementary2, supplementary3);
            Method setIdMethod = AbstractEvent.class.getDeclaredMethod("setId", String.class);
            setIdMethod.invoke(event, id);
            return event;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DeserializeException(e.getMessage(), e);
        }
    }

    private Object getEventModel(Class<? extends IEvent> eventClz) throws DeserializeException {
        try {
            return eventClz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new DeserializeException(e.getMessage(), e);
        }
    }

    private Method getInstanceBuildMethod(Class<? extends IEvent> eventClz) throws DeserializeException {
        try {
            return AbstractEvent.class.getDeclaredMethod(KW_NEW_INSTANCE_METHOD_NAME, String.class, String.class, String.class, String.class, String.class, String.class, String.class);
        } catch (NoSuchMethodException e) {
            throw new DeserializeException(e.getMessage(), e);
        }
    }

    private Map<EventGroupEnum, Class<? extends IEvent>> buildMap(List<Class<? extends IEvent>> clzList) {
        Map<EventGroupEnum, Class<? extends IEvent>> map = new HashMap<>();
        clzList.forEach(c -> {
            EventGroupEnum group = c.getAnnotation(Event.class).group();
            map.put(group, c);
        });
        return map;
    }

    private EventGroupEnum getGroup(String groupName) throws DeserializeException {
        try {
            return EventGroupEnum.valueOf(groupName);
        } catch (IllegalArgumentException e) {
            throw new DeserializeException(e.getMessage(), e);
        }
    }

    private int getKeyHeaderIndex(List<String> headerList, String keyGroupName) {
        return headerList.indexOf(keyGroupName);
    }

    private String getKeyGroupName() throws DeserializeException {
        try {
            Method method = IEvent.class.getDeclaredMethod(KW_EVENT_GROUP_GET_FUNCTION_NAME);
            return method.getAnnotation(CSVField.class).header();
        } catch (Exception e) {
            throw new DeserializeException(e.getMessage(), e);
        }
    }

}
