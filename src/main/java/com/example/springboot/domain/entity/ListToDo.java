package com.example.springboot.domain.entity;

import com.example.springboot.BaseEntity;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "listToDo")
public class ListToDo extends BaseEntity {
    private String nameList;
    @OneToMany(mappedBy = "listToDo")
    private List<Case> cases;
}
