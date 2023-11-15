package com.hthk.fintech.model.data.datacenter.query;

import com.hthk.fintech.model.time.zone.TimeZoneEnum;

import java.time.LocalDate;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 10:20
 */
public class DataSnapshot {

    private SnapshotImageEnum image;

    private TimeZoneEnum timeZone;

    private LocalDate date;

    private String time;

    public SnapshotImageEnum getImage() {
        return image;
    }

    public void setImage(SnapshotImageEnum image) {
        this.image = image;
    }

    public TimeZoneEnum getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZoneEnum timeZone) {
        this.timeZone = timeZone;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
