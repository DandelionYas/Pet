package org.example.spring_rabbitmq.publisher;

import lombok.extern.slf4j.Slf4j;
import org.example.spring_rabbitmq.dto.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQJsonProducer {
    private final RabbitTemplate rabbitTemplate;
    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.json.routing.key}")
    private String jsonRoutingKey;

    public RabbitMQJsonProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendJsonMessage(User user) {
        rabbitTemplate.convertAndSend(exchange, jsonRoutingKey, user);
        log.info("Json message sent => {}", user);
    }
}
