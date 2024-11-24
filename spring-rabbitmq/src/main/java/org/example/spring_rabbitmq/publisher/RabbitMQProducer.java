package org.example.spring_rabbitmq.publisher;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.spring_rabbitmq.config.RabbitMQProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RabbitMQProducer {
    private final RabbitTemplate rabbitTemplate;
    private final RabbitMQProperties properties;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(properties.getExchangeName(), properties.getRoutingKey(), message);
        log.info("Message sent => {}", message);
    }
}
