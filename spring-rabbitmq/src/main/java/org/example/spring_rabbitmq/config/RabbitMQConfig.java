package org.example.spring_rabbitmq.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RabbitMQConfig {
    private final RabbitMQProperties properties;

    // Spring bean for rabbitmq queue
    @Bean
    public Queue queue() {
        return QueueBuilder.durable(properties.getQueueName()).build();
    }

    // Spring bean for rabbitmq queue
    @Bean
    public Queue jsonQueue() {
        return QueueBuilder.durable(properties.getJsonQueueName()).build();
    }

    // Spring bean for rabbitmq exchange
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(properties.getExchangeName());
    }

    // Binding between queue and exchange using routing key
    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(exchange()).with(properties.getRoutingKey());
    }

    // Binding between jsonQueue and exchange using routing key
    @Bean
    public Binding jsonBinding() {
        return BindingBuilder.bind(jsonQueue()).to(exchange()).with(properties.getJsonRoutingKey());
    }

    // The following infrastructure beans are already configured through Spring Boot's Autoconfiguration
    // ConnectionFactory, RabbitTemplate, RabbitAdmin

    // We need to configure a RabbitTemplate for Json Messages
    // Because the default RabbitTemplate is for String Messages
    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    // Add Json Support to the RabbitTemplate
    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        var rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}
