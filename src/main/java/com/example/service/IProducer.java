package com.example.service;

import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;
import io.micronaut.rabbitmq.annotation.RabbitProperty;
import io.reactivex.Single;

@RabbitClient
@RabbitProperty(name = "replyTo", value = "amq.rabbitmq.reply-to")
public interface IProducer {
    @Binding("product")
    Single<String> sendText(String data);
}
