package ru.majordomo.hms.personmgr.models.message.amqp;

import org.springframework.amqp.core.MessageProperties;

import java.util.HashMap;

public class CreateReportMessage {

    private String operationIdentity;
    private String objRef;
    private HashMap<String, String> params;
    private MessageProperties messageProperties;

    public void setHeader(String key, String value) {
        messageProperties.setHeader(key, value);
    }

    public String getOperationIdentity() {
        return operationIdentity;
    }

    public void setOperationIdentity(String operationIdentity) {
        this.operationIdentity = operationIdentity;
    }

    public String getObjRef() {
        return objRef;
    }

    public void setObjRef(String objRef) {
        this.objRef = objRef;
    }

    public HashMap<String, String> getParams() {
        return params;
    }

    public void setParams(HashMap<String, String> params) {
        this.params = params;
    }

    public MessageProperties getMessageProperties() {
        return messageProperties;
    }

    public void setMessageProperties(MessageProperties messageProperties) {
        this.messageProperties = messageProperties;
    }

    public String toString() {
        return "Message: " + "operationIdentity: " + operationIdentity + ", objRef: " + objRef + ", params: " + params.toString();
    }
}

