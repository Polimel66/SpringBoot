package com.example.springboot.domain;

import com.example.springboot.domain.entity.ListToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListToDoRepository extends JpaRepository<ListToDo, Long> {
}
