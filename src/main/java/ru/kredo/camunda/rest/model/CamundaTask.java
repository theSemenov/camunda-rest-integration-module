package ru.kredo.camunda.rest.model;

public class CamundaTask {

    private String activityId;
    private String activityInstanceId;
    private String errorMessage;
    private String errorDetails;
    private String executionId;
    private String id;
    private String lockExpirationTime;
    private String processDefinitionId;
    private String processDefinitionKey;
    private String processInstanceId;
    private String tenantId;
    private Integer retries;
    private Boolean suspended;
    private String workerId;
    private Number priority;
    private String topicName;
    private String businessKey;

    public CamundaTask() {
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityInstanceId() {
        return activityInstanceId;
    }

    public void setActivityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLockExpirationTime() {
        return lockExpirationTime;
    }

    public void setLockExpirationTime(String lockExpirationTime) {
        this.lockExpirationTime = lockExpirationTime;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public Number getPriority() {
        return priority;
    }

    public void setPriority(Number priority) {
        this.priority = priority;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CamundaTask{");
        sb.append("activityId='").append(activityId).append('\'');
        sb.append(", activityInstanceId='").append(activityInstanceId).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append(", errorDetails='").append(errorDetails).append('\'');
        sb.append(", executionId='").append(executionId).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", lockExpirationTime='").append(lockExpirationTime).append('\'');
        sb.append(", processDefinitionId='").append(processDefinitionId).append('\'');
        sb.append(", processDefinitionKey='").append(processDefinitionKey).append('\'');
        sb.append(", processInstanceId='").append(processInstanceId).append('\'');
        sb.append(", tenantId='").append(tenantId).append('\'');
        sb.append(", retries=").append(retries);
        sb.append(", suspended=").append(suspended);
        sb.append(", workerId='").append(workerId).append('\'');
        sb.append(", priority=").append(priority);
        sb.append(", topicName='").append(topicName).append('\'');
        sb.append(", businessKey='").append(businessKey).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
