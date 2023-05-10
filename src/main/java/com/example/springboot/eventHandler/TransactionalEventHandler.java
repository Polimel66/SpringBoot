package com.example.springboot.eventHandler;

import com.example.springboot.event.SaveToBDEvent;
import com.example.springboot.event.SetInformationAboutProductEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@Slf4j
public class TransactionalEventHandler {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void transactionalHandlerRollback(SaveToBDEvent saveToBDEvent)
    {
        log.info("The transactional after rollback event worked for {}", saveToBDEvent.getProduct().getName());
    }
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void transactionalHandlerCommit(SaveToBDEvent saveToBDEvent)
    {
        log.info("The transactional after commit event worked for {}", saveToBDEvent.getProduct().getName());
    }
}
