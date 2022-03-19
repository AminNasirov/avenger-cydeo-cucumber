package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepDefinitions {
Integer actualResult;
    @Given("Calculator app is opened")
    public void calculator_app_is_opened() {
        System.out.println("Calculator is opened");
    }
    @When("user add {int} with {int}")
    public void user_add_with(Integer int1, Integer int2) {
      actualResult = int1+int2;
    }
    @Then("User should see {int} as expected")
    public void user_should_see_as_expected(Integer expectedResult) {
        Assert.assertEquals(expectedResult,actualResult);
    }


}
