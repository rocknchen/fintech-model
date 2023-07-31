package com.hthk.fintech.model.event.basic;

import com.hthk.fintech.enumration.Event;
import com.hthk.fintech.enumration.EventGroupEnum;
import com.hthk.fintech.model.event.IEvent;

import java.time.LocalDateTime;

public abstract class AbstractEvent implements IEvent {

    protected String id;

    protected String domain;

    protected String supplementary1;

    protected String supplementary2;

    protected String supplementary3;

    protected LocalDateTime time;

    public abstract <R extends IEvent> R newInstance(String domain, String typeStr, String subTypeStr, String timeStr);

    public <R extends AbstractEvent> R newInstance(String domain, String typeStr, String subTypeStr, String timeStr,
                                                   String supplementary1, String supplementary2, String supplementary3) {
        R event = newInstance(domain, typeStr, subTypeStr, timeStr);
        event.setSupplementary1(supplementary1);
        event.setSupplementary2(supplementary2);
        event.setSupplementary3(supplementary3);
        return event;
    }

    public final EventGroupEnum getGroup() {
        return this.getClass().getAnnotation(Event.class).group();
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setSupplementary1(String supplementary1) {
        this.supplementary1 = supplementary1;
    }

    public void setSupplementary2(String supplementary2) {
        this.supplementary2 = supplementary2;
    }

    public void setSupplementary3(String supplementary3) {
        this.supplementary3 = supplementary3;
    }
}
