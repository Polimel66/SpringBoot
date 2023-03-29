package com.example.springboot;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;

public class Commodity {
    public Double price;
    @CombinedAnnotation
    public String vendorCode;
}
