package com.example.springboot.event;

import com.example.springboot.ProductDbDto;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class SetInformationAboutProductEvent extends ApplicationEvent {
    private final ProductDbDto product;

    public SetInformationAboutProductEvent(Object source, ProductDbDto product) {
        super(source);
        this.product = product;
    }
}

