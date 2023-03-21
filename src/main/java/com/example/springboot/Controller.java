package com.example.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class Controller {
    @GetMapping("/listOfIncomingHeaders")
    public ResponseEntity<String> listAllHeaders(
            @RequestHeader
            Map<String, String> headers) {
        headers.forEach((key, value) -> log.info(String.format("Header with name (%s) - %s", key, value)));

        return new ResponseEntity<>(
                String.format("Incoming headers: %d", headers.size()), HttpStatus.OK);
    }
}
