package org.example.spring_rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.example.spring_rabbitmq.dto.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQJsonConsumer {

    @RabbitListener(queues = {"${rabbitmq.json.queue.name}"})
    public void consumeJsonMessage(User user) {
        log.info("Received Json Message => {}", user);
    }
}
