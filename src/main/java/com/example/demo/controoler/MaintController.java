package com.example.demo.controoler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintController {
    @GetMapping
    public ResponseEntity<String> getGreetings(){
        return new ResponseEntity<>("welcome to java", HttpStatus.OK);
    }
}
