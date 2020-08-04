package com.cucumber.automation.cucumber.steps.Person;

import com.cucumber.automation.cucumber.steps.StartupDef;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;

import java.util.List;

@Ignore
public class GetPersons extends StartupDef {

    private String personURL = DEFAULT_URL+"/person";
    private List list;

    @Before
    public void before(Scenario scenario) {
        System.out.println("------------------------------");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("------------------------------");
    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
    }

    @When("get service is called")
    public void getServiceIsCalled() {
        list = restTemplate.getForObject(personURL, List.class);
    }

    @Then("the request should respond with the List of Person record size greater than {int}")
    public void theRequestShouldRespondWithStatusAndTheListOfPersonRecord(int size) {
        Assert.assertTrue(list.size()>0);
    }

}
