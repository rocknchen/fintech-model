package com.hthk.fintech.model.file.csv;

import com.hthk.fintech.converter.AttributeStringConverter;

import java.lang.reflect.Method;

public class CSVFieldDTO {

    private String name;

    private String header;

    private Method getMethod;

    private AttributeStringConverter converter;

    public CSVFieldDTO() {
    }

    public CSVFieldDTO(String name, String header, Method getMethod, AttributeStringConverter converter) {
        this.name = name;
        this.header = header;
        this.getMethod = getMethod;
        this.converter = converter;
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

    public AttributeStringConverter getConverter() {
        return converter;
    }

    public void setConverter(AttributeStringConverter converter) {
        this.converter = converter;
    }
}
