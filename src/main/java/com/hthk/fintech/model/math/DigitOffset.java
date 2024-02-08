package com.hthk.fintech.model.math;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/8 11:29
 */
public class DigitOffset {

    private long start;

    private int offSet;

    public DigitOffset(long start, int offSet) {
        this.start = start;
        this.offSet = offSet;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }
}
