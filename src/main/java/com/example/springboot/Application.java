package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var batteryChecker = context.getBean("batteryChecker", BatteryChecker.class);
        batteryChecker.displayBatteryCapacity();
        var memoryChecker = context.getBean("memoryChecker", MemoryChecker.class);
        memoryChecker.displayMemoryCapacity();
        var cameraResolutionChecker = context.getBean("cameraResolutionChecker", CameraResolutionChecker.class);
        cameraResolutionChecker.displayCameraResolution();
        context.close();
    }
}
