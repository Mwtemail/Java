package com.example.demorabbit.mqsdend;

import com.example.demorabbit.config.QueueConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        rabbitTemplate.convertAndSend(QueueConfig.QUEUE_NAME, "你好， 梁桂钊!");
    }
}
