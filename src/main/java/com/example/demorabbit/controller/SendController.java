package com.example.demorabbit.controller;

import com.example.demorabbit.mqsdend.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class SendController {
    @Autowired
    Sender sender;

    @RequestMapping("/sendMessage")
    public String getSendMessage () {
        sender.send();
        return "";
    }
}
