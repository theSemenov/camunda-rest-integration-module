package ru.kredo.camunda.rest.model;

import java.util.Map;

public class FetchedCamundaTask extends CamundaTask {

    private Map<String, TaskVariable> variables;

    public FetchedCamundaTask() {
    }

    public Map<String, TaskVariable> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, TaskVariable> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FetchedCamundaTask{");
        sb.append("variables=").append(variables);
        sb.append('}');
        return sb.toString();
    }
}
