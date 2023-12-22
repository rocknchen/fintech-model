package com.hthk.fintech.model.web.http;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/20 16:34
 */
public class RequestDateTime {

    private String runTimeZone;

    private String runDateTime;

    private String timeZone;

    private String date;

    private String time;

    public String getRunTimeZone() {
        return runTimeZone;
    }

    public void setRunTimeZone(String runTimeZone) {
        this.runTimeZone = runTimeZone;
    }

    public String getRunDateTime() {
        return runDateTime;
    }

    public void setRunDateTime(String runDateTime) {
        this.runDateTime = runDateTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
