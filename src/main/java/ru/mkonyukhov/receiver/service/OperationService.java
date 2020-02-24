package ru.mkonyukhov.receiver.service;

import org.springframework.stereotype.Service;
import ru.mkonyukhov.receiver.model.Message;
import ru.mkonyukhov.receiver.model.Result;

@Service
public class OperationService {
    public Result applyOperation(Message payload, String entityId) {
        return new Result(entityId, payload.getName(), payload.getSum() * payload.getMultiplier());
    }
}
