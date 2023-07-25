package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RegisterUserSuccessfullySteps {
    @And("Select gender Female")
    public void selectGenderFemale() {
        new RegisterPage().setClickOnGenderFemale();
    }

    @And("Enter firstname {string}")
    public void enterFirstname(String firstName) {
        new RegisterPage().setEnterFirstName(firstName);
    }

    @And("Enter last name {string}")
    public void enterLastName(String lastName) {
        new RegisterPage().setEnterLastName(lastName);
    }

    @And("Select day {string}")
    public void selectDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("Select month {string}")
    public void selectMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("Select year {string}")
    public void selectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("Enter email {string}")
    public void enterEmail(String email) {
        new RegisterPage().setEnterEmail(email);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        new RegisterPage().setEnterPassword(password);
    }

    @And("Enter Confirm Password {string}")
    public void enterConfirmPassword(String confirmPassword) {
        new RegisterPage().setEnterConfirmPassword(confirmPassword);
    }

    @Then("Verify Your message {string}")
    public void verifyYourMessage(String successful) {
        Assert.assertEquals("Your Registration successful is not displayed",new RegisterPage().setVerifyTheTextRegistrationCompleted(),successful);
    }
}
