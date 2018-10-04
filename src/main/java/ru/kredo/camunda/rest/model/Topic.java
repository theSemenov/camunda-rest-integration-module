package ru.kredo.camunda.rest.model;

import java.util.List;

public class Topic {
    private String topicName;
    private Long lockDuration;
    private List<String> variables;

    public Topic() {
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Long getLockDuration() {
        return lockDuration;
    }

    public void setLockDuration(Long lockDuration) {
        this.lockDuration = lockDuration;
    }

    public List<String> getVariables() {
        return variables;
    }

    public void setVariables(List<String> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Topic{");
        sb.append("topicName='").append(topicName).append('\'');
        sb.append(", lockDuration=").append(lockDuration);
        sb.append(", variables=").append(variables);
        sb.append('}');
        return sb.toString();
    }
}
