package ru.kredo.camunda.rest;


import ru.kredo.camunda.rest.model.CamundaTask;
import ru.kredo.camunda.rest.model.FetchedCamundaTaskComplete;
import ru.kredo.camunda.rest.model.FetchTaskRequest;
import ru.kredo.camunda.rest.model.FetchedCamundaTask;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/external-task")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface ExternalTaskService {

    @GET
    @Path("/{id}")
    CamundaTask externalTask(@PathParam("id") String id);

    @GET
    List<CamundaTask> externalTasks();

    @GET
    @Path("/count")
    Integer externalTasksCount();

    @POST
    void externalTasksPost();


    @POST
    @Path("/count")
    Integer externalTasksCountPost();

    @POST
    @Path("/fetchAndLock")
    List<FetchedCamundaTask> fetchAndLock(FetchTaskRequest fetchTaskRequest);

    @POST
    @Path("/{id}/complete")
    void complete(@PathParam("id") String id, FetchedCamundaTaskComplete completeTaskRequest);

    /*
    TODO
    POST /external-task/{id}/complete
    Handle BPMN Error
    POST /external-task/{id}/bpmnError
    Handle Failure
    POST /external-task/{id}/failure
            Unlock
    POST /external-task/{id}/unlock
    Set Priority
    PUT /external-task/{id}/priority
    Set Retries
    PUT /external-task/{id}/retries
    */
}
