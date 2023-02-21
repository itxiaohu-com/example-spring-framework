package com.itxiaohu.spring.event.listener;

import com.alibaba.fastjson2.JSON;
import com.itxiaohu.spring.event.MyApplicationEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MySecondListener {

    @Order(2)
    @EventListener
    public void listen(MyApplicationEvent event) {
        log.info("listen-event:{}", JSON.toJSONString(event));
    }

}
