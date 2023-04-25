package com.example.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Random;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ApplicationEventPublisher applicationEventPublisher;
    public ProductDto setInformationAboutProduct(ProductDto product)
    {
        product.setCost(new Random().nextInt(5000));
        product.setQuantityStock(new Random().nextInt(50));
        applicationEventPublisher.publishEvent(new SetInformationAboutProductEvent(this, product));
        return product;
    }
}

