package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MemoryChecker {
    private Phone firstPhone;
    private Phone secondPhone;
    @Autowired
    public void setFirstPhone(@Qualifier("iphoneBean") Phone firstPhone) {
        this.firstPhone = firstPhone;
    }
    @Autowired
    public void setSecondPhone(@Qualifier("nokiaBean") Phone secondPhone) {
        this.secondPhone = secondPhone;
    }
    @PostConstruct
    public void makeInitBean() {
        System.out.println("Memory checker bean created...");
    }

    @PreDestroy
    public void makeDestroyBean() {
        System.out.println("Memory checker bean destroyed...");
    }

}
