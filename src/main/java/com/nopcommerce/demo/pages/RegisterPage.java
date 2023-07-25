package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement clickOnRegister;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyTheTextRegister;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickRegisterButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessageFirstName;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorMessageLastName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement errorMessageEmail;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorMessagePassword;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorMessageConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement clickOnGenderFemale;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement selectDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement selectMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement selectYear;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyTheTextRegistrationCompleted;

    public void setClickOnRegister() {
        clickOnElement(clickOnRegister);
    }

    public String setVerifyTheTextRegister() {
        return getTextFromElement(verifyTheTextRegister);
    }

    public void setClickRegisterButton() {
        clickOnElement(clickRegisterButton);
    }

    public String setErrorMessageFirstName() {
        return getTextFromElement(errorMessageFirstName);
    }

    public String setErrorMessageLastName() {
        return getTextFromElement(errorMessageLastName);
    }

    public String setErrorMessageEmail() {
        return getTextFromElement(errorMessageEmail);
    }

    public String setErrorMessagePassword() {
        return getTextFromElement(errorMessagePassword);
    }

    public String setErrorMessageConfirmPassword() {
        return getTextFromElement(errorMessageConfirmPassword);
    }

    public void setClickOnGenderFemale() {
        clickOnElement(clickOnGenderFemale);
    }

    public void setEnterFirstName(String Name) {
        sendTextToElement(enterFirstName, Name);
    }

    public void setEnterLastName(String LastName) {
        sendTextToElement(enterLastName, LastName);
    }

    public void setEnterEmail(String Email) {
        sendTextToElement(enterEmail, Email);
    }

    public void setEnterPassword(String password) {
        sendTextToElement(enterPassword, password);
    }

    public void setEnterConfirmPassword(String confirmPassword) {
        sendTextToElement(enterConfirmPassword, confirmPassword);
    }
    public void selectDay(String text) {
        selectByVisibleTextFromDropDown(selectDay, text);
    }

    public void selectMonth(String text) {
        selectByVisibleTextFromDropDown(selectMonth, text);
    }

    public void selectYear(String text) {
        selectByVisibleTextFromDropDown(selectYear, text);
    }

    public String setVerifyTheTextRegistrationCompleted(){
        return getTextFromElement(verifyTheTextRegistrationCompleted);
    }


}
