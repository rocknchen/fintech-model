package com.hthk.fintech.serialize;

import com.hthk.fintech.exception.DeserializeException;

import java.util.List;

public interface ModelDeserializeController<R> {

    R process(List<String> headerList, List<String> fieldList) throws DeserializeException;

}
