package com.hthk.fintech.serialize.impl;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.exception.DeserializeException;
import com.hthk.fintech.model.event.IEvent;
import com.hthk.fintech.serialize.ModelDeserializeController;

import java.lang.reflect.Method;
import java.util.List;

import static com.hthk.fintech.config.FintechStaticData.KW_EVENT_GROUP_GET_FUNCTION_NAME;

public class IEventDeserializeController implements ModelDeserializeController<IEvent> {

    @Override
    public IEvent process(List<String> headerList, List<String> fieldList) throws DeserializeException {

        String keyGroupName = getKeyGroupName();
        int keyHeaderIndex = getKeyHeaderIndex(headerList, keyGroupName);

        String groupName = fieldList.get(keyHeaderIndex);
        System.out.println("groupName:" + groupName);

        return null;
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
