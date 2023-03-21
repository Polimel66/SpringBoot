package com.example.springboot;

import lombok.Data;

@Data
public class Dto {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
}
