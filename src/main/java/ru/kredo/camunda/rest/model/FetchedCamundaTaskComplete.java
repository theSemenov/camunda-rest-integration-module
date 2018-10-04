package ru.kredo.camunda.rest.model;

import java.util.Map;

public class FetchedCamundaTaskComplete {

    private String workerId;
    private Map<String, TaskVariable> variables;

    public FetchedCamundaTaskComplete() {
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public Map<String, TaskVariable> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, TaskVariable> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FetchedCamundaTaskComplete{");
        sb.append("workerId='").append(workerId).append('\'');
        sb.append(", variables=").append(variables);
        sb.append('}');
        return sb.toString();
    }
}
