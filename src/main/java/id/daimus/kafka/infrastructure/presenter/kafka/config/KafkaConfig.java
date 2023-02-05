package id.daimus.kafka.infrastructure.presenter.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfig {
    @Value("${spring.kafka.topic.hello}")
    private String helloTopic;
    @Value("${spring.kafka.replication.factor:1}")
    private int replicationFactor;
    @Value("${spring.kafka.partition.number:1}")
    private int partitionNumber;
    @Bean
    public NewTopic helloTopic() {
        return new NewTopic(helloTopic, partitionNumber, (short) replicationFactor);
    }
    @Bean
    public NewTopic teaTopic() {
        String teaTopic = "tea";
        return new NewTopic(teaTopic, partitionNumber, (short) replicationFactor);
    }
    @Bean
    public NewTopic coffeeTopic() {
        String coffeeTopic = "coffee";
        return new NewTopic(coffeeTopic, partitionNumber, (short) replicationFactor);
    }
    @Bean
    public NewTopic herbTopic() {
        String herbTopic = "herb";
        return new NewTopic(herbTopic, partitionNumber, (short) replicationFactor);
    }
}
