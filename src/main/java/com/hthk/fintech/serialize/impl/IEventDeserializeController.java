package com.hthk.fintech.serialize.impl;

import com.hthk.fintech.model.event.IEvent;
import com.hthk.fintech.serialize.ModelDeserializeController;

import java.util.List;

public class IEventDeserializeController implements ModelDeserializeController<IEvent> {

    @Override
    public IEvent process(List<String> headerList, List<String> fieldList) {
        return null;
    }

}
