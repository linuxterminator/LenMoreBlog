package com.huqingshan.LenMore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {

    @GetMapping("/messages")
    public void getMessage(){}

    @GetMapping("/message")
    public void getMessages(){}
}
