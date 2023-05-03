package com.example.springboot;

import java.util.Random;

public class ProductService implements ProductServiceApi{
    @Override
    public ProductDto createProduct(ProductDto product) {
        product.setCost(new Random().nextInt(5000));
        product.setQuantityStock(new Random().nextInt(50));
        return product;
    }
}
