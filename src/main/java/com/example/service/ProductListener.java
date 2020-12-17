package com.example.service;

import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;

@RabbitListener
public class ProductListener {
    @Queue("product")
    public String toUpperCase(String data) {
        return data.toUpperCase();
    }
}
