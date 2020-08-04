package com.cucumber.automation.cucumber.steps.Person;

import com.cucumber.automation.dto.PersonDto;
import com.cucumber.automation.cucumber.steps.BaseDef;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.springframework.http.ResponseEntity;

@Ignore
public class SavePerson extends BaseDef {

    private String personURL = DEFAULT_URL+"/person";
    private PersonDto personDto;
    private ResponseEntity responseEntity;

    @Before
    public void before(Scenario scenario) {
        System.out.println("------------------------------");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("------------------------------");
    }

    @Given("person details are given with {string} and {int}")
    public void personDetailsAreGivenWithNameAndAge(String name, int age) {
        personDto = new PersonDto(name,age);
    }

    @When("post service is called")
    public void postServiceIsCalled() {
        responseEntity = restTemplate.postForEntity(personURL,personDto,String.class);
    }

    @Then("the request should respond with {string} and {int}")
    public void theRequestShouldRespondWithResponse(String message, int code) {
        Assert.assertEquals(message,responseEntity.getBody().toString());
        Assert.assertEquals(code,responseEntity.getStatusCodeValue());
    }

}
