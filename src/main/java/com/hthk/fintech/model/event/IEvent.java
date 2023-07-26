package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.EventTypeTradeEnum;

import java.time.LocalDateTime;

public interface IEvent {

    String getDomain();

    EventTypeTradeEnum getType();

    LocalDateTime getTime();

}
