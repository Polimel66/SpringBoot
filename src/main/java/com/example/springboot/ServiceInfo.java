package com.example.springboot;

import org.springframework.stereotype.Service;

@Service
public class ServiceInfo {
    public Commodity setId(Commodity commodity)
    {
        commodity.info.setId((int) (Math.random()*(200)));
        return commodity;
    }
}
