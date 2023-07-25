package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage (){
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement clickOnComputerTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement verifyTheTextComputer;



    public void setClickOnComputerTab() {
        clickOnElement(clickOnComputerTab);
    }


    public String setVerifyTheTextComputer(){
        return getTextFromElement(verifyTheTextComputer);
    }



}
