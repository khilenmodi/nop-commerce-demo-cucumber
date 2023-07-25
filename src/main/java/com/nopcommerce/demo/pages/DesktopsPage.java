package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage (){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement clickOnDesktopsTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement verifyTheTextDesktops;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement clickOnBuildYourComputer;
    public void setClickOnDesktopsTab(){
        clickOnElement(clickOnDesktopsTab);
    }

    public void setClickOnBuildYourComputer(){
        clickOnElement(clickOnBuildYourComputer);
    }
    public String setVerifyTheTextDesktops(){
        return getTextFromElement(verifyTheTextDesktops);
    }



}


