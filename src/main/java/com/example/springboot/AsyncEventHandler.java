package com.example.springboot;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableAsync
public class AsyncEventHandler {
    @SneakyThrows
    @EventListener
    @Async
    public void asyncHandler(SetInformationAboutProductEvent setInformationAboutProductEvent)
    {
        Thread.sleep(4000);
        log.info("The async event worked for {}", setInformationAboutProductEvent.getProduct().getName());
    }
}

