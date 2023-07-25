package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageNavigateSuccessfully {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("Click on login link")
    public void clickOnLoginLink() {
        new LoginPage().setLogin();
    }

    @Then("verify that  {string}")
    public void verifyThat(String WelcomeText) {
        Assert.assertEquals("Welcome Text is not displayed", new LoginPage().setVerifyTheTextWelcome(),WelcomeText);
    }
}
