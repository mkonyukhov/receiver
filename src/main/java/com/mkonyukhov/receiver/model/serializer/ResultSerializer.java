package com.mkonyukhov.receiver.model.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkonyukhov.receiver.model.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ResultSerializer {
    private static final Logger logger = LoggerFactory.getLogger(ResultSerializer.class);

    public String serialize(Result result) {
        String retval = null;

        try {
            retval = new ObjectMapper().writeValueAsString(result);
        } catch (JsonProcessingException e) {
            logger.error("Serializer error: {}", e.getMessage());
        }

        return retval;
    }
}
