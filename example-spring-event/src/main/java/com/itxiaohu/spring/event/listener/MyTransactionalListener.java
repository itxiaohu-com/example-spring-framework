package com.itxiaohu.spring.event.listener;

import com.alibaba.fastjson2.JSON;
import com.itxiaohu.spring.event.MyApplicationEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 *
 */
@Slf4j
@Component
public class MyTransactionalListener {

    @Async
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT, fallbackExecution = true)
    public void listen(MyApplicationEvent event) {
        log.info("listen-event:{}", JSON.toJSONString(event));
    }

}
