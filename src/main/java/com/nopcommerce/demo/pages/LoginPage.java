package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility{

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTheTextWelcome;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailID;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement Password;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Log out')]")
    WebElement  logOutLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;
    public void setLogin(){
        clickOnElement(login);
    }


    public String setVerifyTheTextWelcome(){
        return getTextFromElement(verifyTheTextWelcome);
    }

    public void setEmailID(String email){
        sendTextToElement(emailID,email);
    }

    public void setPassword(String password){
        sendTextToElement(Password,password);
    }
    public void getLogOutLink() {
        clickOnElement(logOutLink);
    }
    public boolean LogoutLinkDisplayed()
    {
        return logOutLink.isDisplayed();
    }

    public boolean LoginDisplayed()
    {
        return login.isDisplayed();
    }
    public String verifyErrorMessage()
    {
        return getTextFromElement(errorMessage);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }
}
