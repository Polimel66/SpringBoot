package com.example.springboot;

import org.apache.coyote.Response;
import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class SecondController {
    private boolean isErrorOn = false; // Переменная для вызова ошибки, при значении true

    // будет ошибка, которая обработается ExceptionHandler
    @GetMapping("/commodities")
    public Commodity getJson(@RequestBody Commodity body, @RequestParam (required=true) boolean exception) throws CustomException {
        if (isErrorOn) {
            throw new CustomException("Кастомная ошибка 502");
        }
        return body;
    }

    @ExceptionHandler({CustomException.class})
    public ResponseEntity<Dto> handleException(Exception e) {
        var response = new Dto();
        response.setMessage(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(response);
    }
}
