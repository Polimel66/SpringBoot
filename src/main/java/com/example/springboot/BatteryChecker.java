package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BatteryChecker {

    private Phone firstPhone;
    private Phone secondPhone;

    @Autowired
    public BatteryChecker(@Qualifier("iphoneBean") Phone firstPhone, @Qualifier("nokiaBean") Phone secondPhone) {
        this.firstPhone = firstPhone;
        this.secondPhone = secondPhone;
    }

    @PostConstruct
    public void makeInitBean() {
        System.out.println("Battery checker bean created...");
    }

    @PreDestroy
    public void makeDestroyBean() {
        System.out.println("Battery checker bean destroyed...");
    }
}