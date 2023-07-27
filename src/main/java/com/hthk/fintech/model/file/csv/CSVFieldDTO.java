package com.hthk.fintech.model.file.csv;

import com.hthk.fintech.converter.AttributeStringConverter;

import java.lang.reflect.Method;

public class CSVFieldDTO {

    private String name;

    private String header;

    private Method getMethod;

    private Class<? extends AttributeStringConverter> converterClz;

    public CSVFieldDTO() {
    }

    public CSVFieldDTO(String name, String header, Method getMethod, Class<? extends AttributeStringConverter> converterClz) {
        this.name = name;
        this.header = header;
        this.getMethod = getMethod;
        this.converterClz = converterClz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Method getGetMethod() {
        return getMethod;
    }

    public void setGetMethod(Method getMethod) {
        this.getMethod = getMethod;
    }

    public Class<? extends AttributeStringConverter> getConverterClz() {
        return converterClz;
    }

    public void setConverterClz(Class<? extends AttributeStringConverter> converterClz) {
        this.converterClz = converterClz;
    }
}
