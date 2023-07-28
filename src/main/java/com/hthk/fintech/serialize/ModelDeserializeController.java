package com.hthk.fintech.serialize;

import java.util.List;

public interface ModelDeserializeController<R> {

    R process(List<String> headerList, List<String> fieldList);

}
