package com.hthk.fintech.model.param.impl;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/8 15:01
 */
public class ExtProviderConfigIntegerSimple {

    private long start;

    private int offSet;

    public ExtProviderConfigIntegerSimple(long start, int offSet) {
        this.start = start;
        this.offSet = offSet;
    }

    public long getStart() {
        return start;
    }

    public int getOffSet() {
        return offSet;
    }
}
