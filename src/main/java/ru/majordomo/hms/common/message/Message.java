package ru.majordomo.hms.common.message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Message
 */
public class Message {
    private String operationIdentity;

    private OperationType operationType;

    private List<String> accountIdentity = new ArrayList<String>();

    private Map<String, String> operation = new HashMap<String, String>();

    public Message() {
    }

    public Message(String operationIdentity, OperationType operationType, List<String> accountIdentity, Map<String, String> operation) {
        this.operationIdentity = operationIdentity;
        this.accountIdentity = accountIdentity;
        this.operation = operation;
        this.operationType = operationType;
    }

    public String getOperationIdentity() {
        return operationIdentity;
    }

    public void setOperationIdentity(String operationIdentity) {
        this.operationIdentity = operationIdentity;
    }

    public List<String> getAccountIdentity() {
        return accountIdentity;
    }

    public void setAccountIdentity(List<String> accountIdentity) {
        this.accountIdentity = accountIdentity;
    }

    public Map<String, String> getOperation() {
        return operation;
    }

    public void setOperation(Map<String, String> operation) {
        this.operation = operation;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        return "Message{" +
                "operationIdentity='" + operationIdentity + '\'' +
                ", accountIdentity=" + accountIdentity +
                ", operation=" + operation +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}
