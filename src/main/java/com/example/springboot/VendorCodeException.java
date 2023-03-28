package com.example.springboot;
public class VendorCodeException extends RuntimeException{
    private final String message;
    public VendorCodeException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
