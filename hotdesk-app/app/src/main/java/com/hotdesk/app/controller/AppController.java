package com.hotdesk.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<Object> HomeEndpoint(){
        Map<String, String> data = new HashMap<>();
        data.put("Status", "Connection Successful");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping(path = "/test", produces = "application/json")
    public ResponseEntity<Object> TestEndpoint(){
        Map<String, String> data = new HashMap<>();
        data.put("Message", "Hello World");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
