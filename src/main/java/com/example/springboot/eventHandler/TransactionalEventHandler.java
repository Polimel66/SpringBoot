package com.example.springboot.eventHandler;

import com.example.springboot.event.SaveToBDEvent;
import com.example.springboot.event.SetInformationAboutProductEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransactionalEventHandler {
    @EventListener
    public void transactionalHandler(SaveToBDEvent saveToBDEvent)
    {
        log.info("The transactional event worked for {}", saveToBDEvent.getProduct().getName());
    }
}
