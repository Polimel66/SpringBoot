package com.example.springboot;

import org.springframework.stereotype.Component;


public interface Phone {
    String getBatteryCapacity();

    String getMemoryCapacity();

    String getCameraResolution();
}
