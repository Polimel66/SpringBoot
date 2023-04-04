package com.example.springboot;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
@Data
public class Commodity {
    private Double price;
    @CombinedAnnotation
    private String vendorCode;
}
