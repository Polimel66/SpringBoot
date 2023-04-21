package com.example.springboot.domain.entity;

import com.example.springboot.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "case")
public class Case extends BaseEntity {
    private String nameCase;
    @ManyToOne
    @JoinColumn(name = "listToDo_id")
    private ListToDo listToDo;

}
