package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VytrackLoginStepDefinitions {
VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    @Given("User is on the Login Page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("envytruck"));
    }
    @When("User enter valid username")
    public void user_enter_valid_username() {
      vytrackLoginPage.userInput.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));

    }
    @When("User enter valid password")
    public void user_enter_valid_password() {

        vytrackLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
    }
    @When("User click Login Button")
    public void user_click_login_button() {

        vytrackLoginPage.loginButton.click();
    }


    @Then("User should be able to see  {string} As Title")
    public void userShouldBeAbleToSeeAsTitle(String expectedTitle) {


        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }
}
