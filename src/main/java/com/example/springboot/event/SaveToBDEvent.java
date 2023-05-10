package com.example.springboot.event;

import com.example.springboot.ProductDbDto;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;
@Getter
public class SaveToBDEvent extends ApplicationEvent {
    private final ProductDbDto product;

    public SaveToBDEvent(Object source, ProductDbDto product) {
        super(source);
        this.product = product;
    }
}
