package com.example.springboot;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
public class Info {
    @Getter
    @Setter
    private String date;
    @Getter
    @Setter
    private int id;

    public Info(String date, int id) {
        this.date = date;
        this.id = ServiceId.generateId();
    }
}
