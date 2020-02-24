package com.mkonyukhov.receiver.service;

import com.mkonyukhov.receiver.model.Result;
import org.springframework.stereotype.Service;
import com.mkonyukhov.receiver.model.Message;

@Service
public class OperationService {
    public Result applyOperation(Message payload, String entityId) {
        return new Result(entityId, payload.getName(), payload.getSum() * payload.getMultiplier());
    }
}
