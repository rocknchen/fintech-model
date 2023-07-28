package com.hthk.fintech.serialize.impl;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.Event;
import com.hthk.fintech.enumration.EventGroupEnum;
import com.hthk.fintech.exception.DeserializeException;
import com.hthk.fintech.model.event.IEvent;
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

        String groupName = fieldList.get(keyHeaderIndex);

        EventGroupEnum eventGroup = getGroup(groupName);

        Reflections reflections = new Reflections(new ConfigurationBuilder().forPackages(DEFAULT_PACKAGE));
        Set<Class<? extends IEvent>> eventClzSet = reflections.getSubTypesOf(IEvent.class);
        System.out.println("eventClzSet:" + eventClzSet);
        Map<EventGroupEnum, Class<? extends IEvent>> eventClzMap = buildMap(eventClzSet);

        Class<? extends IEvent> eventClz = eventClzMap.get(eventGroup);
        Method newInstanceMethod = getInstanceBuildMethod(eventClz);

        Object eventModelTemplate = getEventModel(eventClz);
        IEvent eventModel = buildEventModel(newInstanceMethod, eventModelTemplate, fieldList);
        return eventModel;
    }

    /**
     * TODO
     *
     * @param newInstanceMethod
     * @param eventModelTemplate
     * @param fieldList
     * @return
     */
    private IEvent buildEventModel(Method newInstanceMethod, Object eventModelTemplate, List<String> fieldList) throws DeserializeException {
        String domain = fieldList.get(0);
        String type = fieldList.get(2);
        String subType = fieldList.get(3);
        String time = fieldList.get(4);
        try {
            return (IEvent) newInstanceMethod.invoke(eventModelTemplate, domain, type, subType, time);
        } catch (Exception e) {
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
            return eventClz.getDeclaredMethod(KW_NEW_INSTANCE_METHOD_NAME, String.class, String.class, String.class, String.class);
        } catch (NoSuchMethodException e) {
            throw new DeserializeException(e.getMessage(), e);
        }
    }

    private Map<EventGroupEnum, Class<? extends IEvent>> buildMap(Set<Class<? extends IEvent>> eventClzSet) {
        Map<EventGroupEnum, Class<? extends IEvent>> map = new HashMap<>();
        List<Class<? extends IEvent>> clzList = eventClzSet.stream().collect(Collectors.toList());
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
