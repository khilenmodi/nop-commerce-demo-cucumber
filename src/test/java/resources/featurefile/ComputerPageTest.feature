@regression
Feature: ComputerPageTest
  As user I want to login into com.nopcommerce.demo

  @smoke
  Scenario: verifyUserShouldNavigateToComputerPageSuccessfully
    Given I am on homepage
    When  Click on Computer tab
    Then  verify The Text "Computers"

  @smoke
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on homepage
    When  Click on Computer tab
    And   Click on Desktops link
    Then  Verify Text "Desktops"

  @smoke
  Scenario Outline: VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
  String hdd, String os, String software)
    Given I am on homepage
    When Click on Computer tab
    And  Click on Desktops link
    And  Click on product name Build your own computer
    And  Select processor "<processor>"
    And  Select RAM "<ram>"
    And  Select HDD "<hdd>"
    And  Select OS "<os>"
    And  Select Software "<software>"
    And  Click on Button ADD TO CART
    Then Verify the message "The product has been added to your shopping cart"

    Examples:
      | processor                                       | ram           | hdd | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 | Vista Home [+$50.00]    | Total Commander [+$5.00]   |