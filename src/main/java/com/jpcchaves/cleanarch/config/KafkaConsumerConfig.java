package com.jpcchaves.cleanarch.config;

import com.jpcchaves.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

import static org.apache.kafka.clients.consumer.ConsumerConfig.*;


public class KafkaConsumerConfig {

    public ConsumerFactory<? super String, ? super CustomerMessage> consumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        configProps.put(GROUP_ID_CONFIG, "jpcchaves");
        configProps.put(KEY_DESERIALIZER_CLASS_CONFIG, String.valueOf(StringDeserializer.class));
        configProps.put(VALUE_DESERIALIZER_CLASS_CONFIG, String.valueOf(StringDeserializer.class));
        configProps.put(AUTO_OFFSET_RESET_CONFIG, "earliest");
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CustomerMessage> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, CustomerMessage> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}
