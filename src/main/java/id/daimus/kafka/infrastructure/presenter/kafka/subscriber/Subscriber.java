package id.daimus.kafka.infrastructure.presenter.kafka.subscriber;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Subscriber {
    @KafkaListener(topics = "hello", concurrency = "${spring.kafka.consumer.level.concurrency:3}")
    public void subscribeHello(@Payload String message){
        log.info("[hello] received message: " + message);
    }

    @KafkaListener(topics = "tea", concurrency = "${spring.kafka.consumer.level.concurrency:3}")
    public void subscribeTea(@Payload String message){
        log.info("[tea] received message: " + message);
    }

    @KafkaListener(topics = "coffee", concurrency = "${spring.kafka.consumer.level.concurrency:3}")
    public void subscribeCoffee(@Payload String message){
        log.info("[coffee] received message: " + message);
    }

    @KafkaListener(topics = "herb", concurrency = "${spring.kafka.consumer.level.concurrency:3}")
    public void subscribeHerb(@Payload String message){
        log.info("[herb] received message: " + message);
    }
}
