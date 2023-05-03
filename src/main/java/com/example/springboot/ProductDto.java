package com.example.springboot;

import lombok.Data;

@Data
public class ProductDto {
    private String name;

    private int articleNumber;

    private int cost;

    private int quantityStock;
}
