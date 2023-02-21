package com.itxiaohu.spring.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class MyApplicationEvent extends ApplicationEvent {

    private String id;
    private String payload;

    public MyApplicationEvent(Object source, String id, String payload) {
        super(source);
        this.id = id;
        this.payload = payload;
    }

}