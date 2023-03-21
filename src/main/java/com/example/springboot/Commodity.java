package com.example.springboot;

import lombok.Getter;
import lombok.Setter;

public class Commodity {
    @Getter
    @Setter
    public Double price;
    @Getter
    @Setter
    public Info info;

    public Commodity(Double price, Info info) {
        this.price = price;
        this.info = info;
    }
}
