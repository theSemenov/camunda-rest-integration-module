package ru.kredo.camunda.rest.model;

import com.fasterxml.jackson.databind.JsonNode;

public class TaskVariable {
    private String type;
    private Object value;
    private JsonNode valueInfo;

    public TaskVariable() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public JsonNode getValueInfo() {
        return valueInfo;
    }

    public void setValueInfo(JsonNode valueInfo) {
        this.valueInfo = valueInfo;
    }
}
