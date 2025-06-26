package com.codewithdave.store.controllers;

import com.codewithdave.store.entities.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/hello")
    public Message sayHello(){
        return new Message("Hello, World!");
    }
}
