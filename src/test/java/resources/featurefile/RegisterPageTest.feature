@regression
Feature: RegisterPageTest
  As user I want to Register into com.nopcommerce.demo

  @sanity
  Scenario: userShouldNavigateToRegisterPageSuccessFully
    Given I am on homepage
    When  Click on Register link
    Then  verify Text "Register"

  @smoke
  Scenario: verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    Given I am on homepage
    When  Click on Register link
    And   Click on button REGISTER
    Then Verify the error  "First name is required."
    Then Verify the error message "Last name is required."
    Then Verify error message "Email is required."
    Then Verify message "Password is required."
    Then Verify "Password is required."

  @regression
  Scenario:  VerifyThatUserShouldCreateAccountSuccessfully
    Given I am on homepage
    When Click on Register link
    And  Select gender Female
    And   Enter firstname "Khilen"
    And    Enter last name "Modi"
    And    Select day "15"
    And    Select month "10"
    And    Select year "1982"
    And     Enter email "KhilenModi2003@Yahoo.com"
    And    Enter password "khilen123"
    And   Enter Confirm Password "khilen123"
    And   Click on button REGISTER
    Then   Verify Your message "Your registration completed"