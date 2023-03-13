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
    public void setPhone(@Qualifier("iphoneBean") Phone firstPhone, @Qualifier("nokiaBean") Phone secondPhone) {
        this.firstPhone = firstPhone;
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

    public void displayMemoryCapacity() {
        System.out.printf("Current memory capacity: Iphone - %s, Nokia - %s.\n", firstPhone.getMemoryCapacity(), secondPhone.getMemoryCapacity());
    }
}
