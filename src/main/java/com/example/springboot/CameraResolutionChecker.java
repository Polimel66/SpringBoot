package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CameraResolutionChecker {
    @Autowired
    @Qualifier("iphoneBean")
    private Phone firstPhone;
    @Autowired
    @Qualifier("nokiaBean")
    private Phone secondPhone;

    @PostConstruct
    public void makeInitBean()
    {
        System.out.println("Camera resolution checker bean created...");
    }

    @PreDestroy
    public void makeDestroyBean()
    {
        System.out.println("Camera resolution checker bean destroyed...");
    }

    public void displayCameraResolution() {
        System.out.printf("Current camera resolution: Iphone - %s, Nokia - %s.\n", firstPhone.getCameraResolution(), secondPhone.getCameraResolution());
    }
}
