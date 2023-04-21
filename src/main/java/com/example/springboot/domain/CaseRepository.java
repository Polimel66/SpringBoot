package com.example.springboot.domain;

import com.example.springboot.domain.entity.Case;
import com.example.springboot.domain.entity.ListToDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaseRepository extends JpaRepository<Case, Long> {
    List<Case> findByListToDo(ListToDo listToDo);
}
