package com.example.springboot;

import lombok.Data;

@Data
public class CommodityDto {
    private String name;
    private double price;
    private String vendorCode;
    private int quantityInStock;
    private String environmentVariable;
}