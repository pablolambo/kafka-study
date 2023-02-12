package com.example.GlobalLogicRest20221216.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic carTopic(){
        return TopicBuilder.name("carTopic")
                .build();
    }
}
