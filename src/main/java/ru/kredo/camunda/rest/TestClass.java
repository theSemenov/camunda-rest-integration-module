package ru.kredo.camunda.rest;

import ru.kredo.camunda.rest.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestClass {

    public static void main(String[] args) {
        ExternalTaskService service = ExternalTaskServiceFactory.get("http://127.0.0.1:8080/engine-rest/"); // Указать адрес сервиса камунды
        List<CamundaTask> camundaTasks = service.externalTasks();
        System.out.println("All camunda active tasks");
        camundaTasks.forEach(System.out::println);
        System.out.println("\n\n");


        Optional<CamundaTask> taskOp = camundaTasks.stream().findFirst();
        if (taskOp.isPresent()) {
            System.out.println("A camunda active task");
            CamundaTask task = service.externalTask(taskOp.get().getId());
            System.out.println(task);
        }

        Topic topic = new Topic();
        topic.setTopicName("Portfolio_process_topic");
        topic.setLockDuration(1000l);

        FetchTaskRequest fetchTaskRequest = new FetchTaskRequest();
        fetchTaskRequest.setWorkerId("testWorker");
        fetchTaskRequest.setMaxTasks(5);
        fetchTaskRequest.setTopics(Arrays.asList(topic));

        System.out.println("\n\n");
        System.out.println("All camunda fech task");
        List<FetchedCamundaTask> fetchedCamundaTasks  = service.fetchAndLock(fetchTaskRequest);
        fetchedCamundaTasks.forEach(System.out::println);

        Optional<FetchedCamundaTask> fetchedCamundaTaskOp = fetchedCamundaTasks.stream().findFirst();
        if (fetchedCamundaTaskOp.isPresent()) {
            System.out.println("Try to complete camunda fech task");
            FetchedCamundaTask fetchTask = fetchedCamundaTaskOp.get();
            FetchedCamundaTaskComplete completeReq =  new FetchedCamundaTaskComplete();
            completeReq.setWorkerId(fetchTask.getWorkerId());
            service.complete(fetchTask.getId(), completeReq);
        }
    }
}
