package com.example.consumer;

import com.example.consumer.config.RabbitMQConfig;
import com.example.consumer.dto.StudentDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    private static Logger LOGGER = LoggerFactory.getLogger(ConsumerListener.class);

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void Listener(StudentDto studentDto){
        LOGGER.info("********************DIRECT EXCHANGE******************");
        LOGGER.info("QUEUE INFO", studentDto);
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE2)
    public void Listener2(StudentDto studentDto){
        LOGGER.info("********************FANOUT EXCHANGE******************");
        LOGGER.info("QUEUE INFO", studentDto);
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_GET)
    public void Listener3(StudentDto studentDto){
        LOGGER.info("********************TOPIC GET EXCHANGE******************");
        LOGGER.info("QUEUE INFO", studentDto);
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_POST)
    public void Listener4(StudentDto studentDto){
        LOGGER.info("********************TOPIC POST EXCHANGE******************");
        LOGGER.info("QUEUE INFO", studentDto);
    }
    
}
