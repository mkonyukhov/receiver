package ru.mkonyukhov.receiver.model.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.mkonyukhov.receiver.model.Message;

public class MessageDeserializer implements Deserializer<Message> {
    private static final Logger logger = LoggerFactory.getLogger(MessageDeserializer.class);

    @Override
    public Message deserialize(String topic, byte[] data) {
        final ObjectMapper objectMapper = new ObjectMapper();
        Message message = null;

        try {
            message = objectMapper.readValue(data, Message.class);
        } catch (Exception e) {
            logger.error("Deserializer error: {}", e.getMessage());
        }

        return message;
    }
}
