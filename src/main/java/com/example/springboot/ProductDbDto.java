package com.example.springboot;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "first_table")
public class ProductDbDto {
    @Id
    private String id = UUID.randomUUID().toString();
    @Column
    private String name;
    @Column
    private int articleNumber;
    @Column
    private int cost;
    @Column
    private int quantityStock;
}

