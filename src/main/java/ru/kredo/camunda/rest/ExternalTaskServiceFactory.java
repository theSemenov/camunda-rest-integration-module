package ru.kredo.camunda.rest;


import org.glassfish.jersey.client.proxy.WebResourceFactory;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class ExternalTaskServiceFactory {

    public static ExternalTaskService get(String url) {
        ClientBuilder builder = ClientBuilder.newBuilder();
        WebTarget target = builder.build().target(url);
        ExternalTaskService service = WebResourceFactory.newResource(ExternalTaskService.class, target);
        return service;
    }
}
