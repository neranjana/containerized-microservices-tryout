package com.neranjana.tryout.microservices.TimeService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


import java.util.Date;

@RestController
@RequestMapping(path = "/timeservice")
public class TimeController {

    @GetMapping(path = "/now")
    public ResponseEntity<String> getTime() {
        return new ResponseEntity<>(new Date().toString(), HttpStatus.OK);
    }

}