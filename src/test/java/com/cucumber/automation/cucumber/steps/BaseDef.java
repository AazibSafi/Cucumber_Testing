package com.cucumber.automation.cucumber.steps;

import org.springframework.web.client.RestTemplate;

public class BaseDef {

    protected RestTemplate restTemplate = new RestTemplate();
    protected final String DEFAULT_URL = "http://localhost:8080/";

}
