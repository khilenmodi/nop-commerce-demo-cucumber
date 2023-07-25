package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class InvalidCredentials {

    @And("Click on button REGISTER")
    public void clickOnButtonREGISTER() {
        new RegisterPage().setClickRegisterButton();
    }

    @Then("Verify the error  {string}")
    public void verifyTheError(String FirstName) {
        Assert.assertEquals("FirstName is not displayed",new RegisterPage().setErrorMessageFirstName(),FirstName);
    }


    @Then("Verify the error message {string}")
    public void verifyTheErrorMessage(String LastName) {
        Assert.assertEquals("LastName is not Displayed", new RegisterPage().setErrorMessageLastName(),LastName);

    }

    @Then("Verify error message {string}")
    public void verifyErrorMessage(String email) {
        Assert.assertEquals("Email is not displayed", new RegisterPage().setErrorMessageEmail(),email);
    }


    @Then("Verify message {string}")
    public void verifyMessage(String Password) {
        Assert.assertEquals("Password is wrong", new RegisterPage().setErrorMessagePassword(),Password);
    }


    @Then("Verify {string}")
    public void verify(String ConfirmPassword)  {
    Assert.assertEquals("ConfirmPassword is not displayed", new RegisterPage().setErrorMessageConfirmPassword(),ConfirmPassword);
    }


}

