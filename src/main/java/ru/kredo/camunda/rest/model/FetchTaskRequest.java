package ru.kredo.camunda.rest.model;

import java.util.List;

public class FetchTaskRequest {

    String workerId;
    Integer maxTasks;
    Boolean usePriority;
    List<Topic> topics;

    public FetchTaskRequest() {
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public Integer getMaxTasks() {
        return maxTasks;
    }

    public void setMaxTasks(Integer maxTasks) {
        this.maxTasks = maxTasks;
    }

    public Boolean getUsePriority() {
        return usePriority;
    }

    public void setUsePriority(Boolean usePriority) {
        this.usePriority = usePriority;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FetchTaskRequest{");
        sb.append("workerId='").append(workerId).append('\'');
        sb.append(", maxTasks=").append(maxTasks);
        sb.append(", usePriority=").append(usePriority);
        sb.append(", topics=").append(topics);
        sb.append('}');
        return sb.toString();
    }
}
