package com.example.springboot;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "first_table")
public class ProductDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private int articleNumber;
    @Column
    private int cost;
    @Column
    private int quantityStock;
}

