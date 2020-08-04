package com.cucumber.automation.cucumber.steps.Person;

import com.cucumber.automation.cucumber.steps.BaseDef;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Ignore;

@Ignore
public class DeletePerson extends BaseDef {

    private String personURL = DEFAULT_URL+"/person";

    @Before
    public void before(Scenario scenario) {
        System.out.println("------------------------------");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("------------------------------");
    }

    @Given("user is log in to Application")
    public void userIsLogInToApplication() {
    }

    @When("delete service is called with Person id {int}")
    public void deleteServiceIsCalledWithPersonIdId(int id) {
        restTemplate.delete(personURL+"/"+id);
    }

    @Then("the Data should be deleted")
    public void theDataShouldBeDeleted() {
    }

}
