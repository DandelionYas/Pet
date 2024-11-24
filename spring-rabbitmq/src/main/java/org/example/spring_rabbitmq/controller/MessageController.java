package org.example.spring_rabbitmq.controller;

import org.example.spring_rabbitmq.dto.User;
import org.example.spring_rabbitmq.publisher.RabbitMQJsonProducer;
import org.example.spring_rabbitmq.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    private final RabbitMQProducer producer;
    private final RabbitMQJsonProducer jsonProducer;

    public MessageController(RabbitMQProducer producer, RabbitMQJsonProducer jsonProducer) {
        this.producer = producer;
        this.jsonProducer = jsonProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent to RabbitMQ...");
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user) {
        jsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Json Message sent to RabbitMQ...");
    }
}
