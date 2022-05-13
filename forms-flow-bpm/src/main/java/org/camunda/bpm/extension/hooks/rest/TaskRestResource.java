package org.camunda.bpm.extension.hooks.rest;

import org.camunda.bpm.engine.rest.dto.CountResultDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@RequestMapping(RestResource.BASE_PATH+TaskRestResource.PATH)
public interface TaskRestResource extends RestResource {

    String PATH = "/v1/task";

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON)
    CountResultDto getTasksCount(@Context UriInfo uriInfo);
}
