package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuildYourComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourComputerPage.class.getName());

    public BuildYourComputerPage (){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement selectProcessor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement selectRAM;

    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement selectHDD;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement selectHDD1;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//ul[@class='option-list']")
    List<WebElement> selectOs;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//ul[@class='option-list']")
   List<WebElement> selectSoftware;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement selectAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyTheProductHasBeenAddedToYourShoppingCart;


    public void setSelectProcessor(String processor){
        selectByVisibleTextFromDropDown(selectProcessor,processor);
    }
    public void setSelectRAM(String ram){
        selectByVisibleTextFromDropDown(selectRAM,ram);
    }

    public void setSelectOs(String OS){
        for (WebElement element : selectOs){
            if(element.getText().contains(OS)){
                clickOnElement(element);
                break;
            }
        }
    }

    public void setSelectHDD(String hdd){
        switch (hdd){
            case "320":
                clickOnElement(selectHDD);
            case "400":
                clickOnElement(selectHDD1);
            default:
                clickOnElement(selectHDD1);
        }
    }

    public void setSelectSoftware(String software){
        for (WebElement element : selectSoftware ){
            if (element.getText().contains(software)){
                clickOnElement(element);
                break;
            }
        }
    }

    public void setSelectAddToCartButton(){
        clickOnElement(selectAddToCartButton);
    }

    public String setVerifyTheProductHasBeenAddedToYourShoppingCart(){
       return getTextFromElement(verifyTheProductHasBeenAddedToYourShoppingCart);
    }


}
