package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@Validated
public class Controller {
    @GetMapping("/validationCommodities")
    public Commodity getJson(@Valid @RequestBody Commodity body) {
        return body;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleException(MethodArgumentNotValidException e) {
        StringBuilder errorMap = new StringBuilder();
        e.getBindingResult().getFieldErrors().forEach(exception -> errorMap.append("Ошибка - ")
                .append(exception.getDefaultMessage())
                .append(", в поле - ")
                .append(exception.getField()).append(";\n"));
        return errorMap.toString();
    }
}
