package com.example.springboot;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "")
public class ProductDto {
    @Id
    @GeneratedValue()
    private String id;
    @Column
    private String name;
    @Column
    private int articleNumber;
    @Column
    private int cost;
    @Column
    private int quantityStock;
}

