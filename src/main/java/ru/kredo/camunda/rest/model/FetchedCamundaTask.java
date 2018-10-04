package ru.kredo.camunda.rest.model;

public class FetchedCamundaTask extends CamundaTask {

    /*
    TODO рачпарсить variables
     */
    private String variables;

    public FetchedCamundaTask() {
    }

    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FetchedCamundaTask{");
        sb.append("variables='").append(variables).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
