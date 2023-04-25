package com.example.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransactionalEventHandler {
    @EventListener
    public void transactionalHandler(SetInformationAboutProductEvent setInformationAboutProductEvent)
    {
        log.info("The transactional event worked for {}", setInformationAboutProductEvent.getProduct().getName());
    }
}
