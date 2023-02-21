package com.itxiaohu.spring.event;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

@Slf4j
public class MyApplicationEventTest {

    @Test
    public void test() {
        String basePackage = this.getClass().getPackage().getName();
        log.info("basePackage:{}", basePackage);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(basePackage);


        MyApplicationEvent event = new MyApplicationEvent(this, UUID.randomUUID().toString(), "Test Data");
        context.publishEvent(event);

    }

}
