package ru.mkonyukhov.receiver.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import ru.mkonyukhov.receiver.configuration.KafkaProperties;
import ru.mkonyukhov.receiver.model.Message;
import ru.mkonyukhov.receiver.model.Result;
import ru.mkonyukhov.receiver.model.serializer.ResultSerializer;
import ru.mkonyukhov.receiver.service.OperationService;

@Controller
@EnableConfigurationProperties(KafkaProperties.class)
public class ReceiverKafkaController {

    private static final Logger logger = LoggerFactory.getLogger(ReceiverKafkaController.class);

    private final OperationService operationService;
    private final ResultSerializer resultSerializer;

    public ReceiverKafkaController(OperationService operationService, ResultSerializer resultSerializer) {
        this.operationService = operationService;
        this.resultSerializer = resultSerializer;
    }

    @KafkaListener(topics = "#{kafkaProperties.inTopicName}")
    public void listen(ConsumerRecord<String, Message> consumerRecord) {
        Result result = operationService.applyOperation(consumerRecord.value(), consumerRecord.key());
        final String serialize = resultSerializer.serialize(result);
        logger.debug(serialize);
    }
}
