package com.cucumber.automation.cucumber.steps.Person;

import com.cucumber.automation.cucumber.steps.BaseDef;
import com.cucumber.automation.dto.PersonDto;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;

@Ignore
public class GetSinglePerson extends BaseDef {

    private String personURL = DEFAULT_URL+"/person";
    private PersonDto personDto;

    @Before
    public void before(Scenario scenario) {
        System.out.println("------------------------------");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("------------------------------");
    }

    @Given("user is log in")
    public void userIsLogIn() {
    }

    @When("get service is called with Person id {int}")
    public void getServiceIsCalledWithPersonIdId(int id) {
        personDto = restTemplate.getForObject(personURL+"/"+id, PersonDto.class);
    }

    @Then("the request should respond with Person {string} and {int}")
    public void theRequestShouldRespondWithPersonNameAndAge(String name, int age) {
        Assert.assertEquals(name,personDto.getName());
        Assert.assertEquals(age,personDto.getAge());
    }

}
