package com.sion.sionojbackendquestionservice.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author : wick
 * @Date : 2024/11/7 11:55
 */
@Component
public class MyMessageProducer {

    @Resource
    private RabbitTemplate rabbitTemplate;


    /**
     * 发送消息
     * @param message
     * @param routingKey
     * @param exchange
     */
    public void sendMessage(String message,String routingKey, String exchange) {
        rabbitTemplate.convertAndSend(message,routingKey,exchange);

    }
}
