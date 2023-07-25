package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerPageSteps {
    @When("Click on Computer tab")
    public void clickOnComputerTab() {
        new ComputerPage().setClickOnComputerTab();
    }

    @Then("verify The Text {string}")
    public void verifyTheText(String Computers) {
        Assert.assertEquals("Computer Text is not displayed", new ComputerPage().setVerifyTheTextComputer(), Computers);
    }

    @And("Click on Desktops link")
    public void clickOnDesktopsLink() {
        new DesktopsPage().setClickOnDesktopsTab();
    }

    @Then("Verify Text {string}")
    public void verifyText(String DeskTops) {
        Assert.assertEquals("Desktops text is not displayed", new DesktopsPage().setVerifyTheTextDesktops(), DeskTops);
    }

    @And("Click on product name Build your own computer")
    public void clickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().setClickOnBuildYourComputer();
    }

    @And("Select processor {string}")
    public void selectProcessor(String processor) {
        new BuildYourComputerPage().setSelectProcessor(processor);
    }

    @And("Select RAM {string}")
    public void selectRAM(String ram) {
        new BuildYourComputerPage().setSelectRAM(ram);
    }

    @And("Select HDD {string}")
    public void selectHDD(String hdd) {
        new BuildYourComputerPage().setSelectHDD(hdd);
    }

    @And("Select OS {string}")
    public void selectOS(String os) {
        new BuildYourComputerPage().setSelectOs(os);
    }

    @And("Select Software {string}")
    public void selectSoftware(String software) {
        new BuildYourComputerPage().setSelectSoftware(software);
    }

    @And("Click on Button ADD TO CART")
    public void clickOnButtonADDTOCART() {
        new BuildYourComputerPage().setSelectAddToCartButton();
    }

    @Then("Verify the message {string}")
    public void verifyTheMessage(String Text) {
        Assert.assertEquals("Product Added to cart is not Displayed", new BuildYourComputerPage().setVerifyTheProductHasBeenAddedToYourShoppingCart(), Text);
    }


}
