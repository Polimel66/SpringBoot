package com.example.springboot;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.Date;

public class Info {
    @Getter
    @Setter
    private String date;
    @Getter
    @Setter
    private int Id;

    public Info(String date, int id) {
        this.date = date;
        Id = (int) (Math.random()*(200));
    }


}
