package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class Controller {
    @GetMapping("/validationCommodities")
    public Commodity getJson(@Valid @RequestBody Commodity body) throws VendorCodeException{
        return body;
    }

    @ExceptionHandler({VendorCodeException.class})
    public ResponseEntity<Dto> handleException(RuntimeException e) {
        var response = new Dto();
        response.setMessage(e.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
