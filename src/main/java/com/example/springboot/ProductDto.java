package com.example.springboot;

import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private Long articleNumber;
    private int cost;
    private int quantityStock;
}

