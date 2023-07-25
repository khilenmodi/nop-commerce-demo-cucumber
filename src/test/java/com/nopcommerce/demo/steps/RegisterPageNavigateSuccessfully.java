package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterPageNavigateSuccessfully {
    @When("Click on Register link")
    public void clickOnRegisterLink() {
        new RegisterPage().setClickOnRegister();
    }

    @Then("verify Text {string}")
    public void verifyText(String registerText) {
        Assert.assertEquals("Text Register Not displayed", new RegisterPage().setVerifyTheTextRegister(),registerText);
    }


}
