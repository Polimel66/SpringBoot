package com.example.springboot;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
@Getter
public class SaveToBDEvent extends ApplicationEvent {
    private final ProductDto product;

    public SaveToBDEvent(Object source, ProductDto product) {
        super(source);
        this.product = product;
    }
}
