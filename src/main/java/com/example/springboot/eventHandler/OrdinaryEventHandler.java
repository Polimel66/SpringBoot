package com.example.springboot.eventHandler;

import com.example.springboot.event.SetInformationAboutProductEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrdinaryEventHandler {
    @EventListener
    public void ordinaryHandler(SetInformationAboutProductEvent setInformationAboutProductEvent)
    {
        log.info("The ordinary event worked for {}", setInformationAboutProductEvent.getProduct().getName());
    }
}

