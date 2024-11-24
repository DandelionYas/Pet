package org.example.spring_rabbitmq.publisher;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.spring_rabbitmq.config.RabbitMQProperties;
import org.example.spring_rabbitmq.dto.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RabbitMQJsonProducer {
    private final RabbitTemplate rabbitTemplate;
    private final RabbitMQProperties properties;

    public void sendJsonMessage(User user) {
        rabbitTemplate.convertAndSend(properties.getExchangeName(), properties.getJsonRoutingKey(), user);
        log.info("Json message sent => {}", user);
    }
}
