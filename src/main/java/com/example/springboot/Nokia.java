package com.example.springboot;

import org.springframework.stereotype.Component;

@Component("nokiaBean")
public class Nokia implements Phone {
    @Override
    public String getBatteryCapacity() {
        return "50%";
    }

    @Override
    public String getMemoryCapacity() {
        return "128 MB";
    }

    @Override
    public String getCameraResolution() {
        return "2 megapixels";
    }
}