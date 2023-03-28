package com.example.springboot;

import org.springframework.stereotype.Service;

@Service
public class ServiceId {
    public static int generateId()
    {
        return (int) (Math.random()*(200));
    }
}
