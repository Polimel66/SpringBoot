package com.example.springboot;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("iphoneBean")
public class Iphone  implements Phone{

    @Override
    public String getBatteryCapacity() {
        return "100%";
    }

    @Override
    public String getMemoryCapacity() {
        return "512 GB";
    }

    @Override
    public String getCameraResolution() {
        return "48 megapixels";
    }
}