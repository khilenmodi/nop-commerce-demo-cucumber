@regression
Feature: LoginPageTest
  As user I want to login into com.nopcommerce.demo
@sanity
  Scenario: userShouldNavigateToLoginPageSuccessFully
    Given I am on homepage
    When  Click on login link
    Then  verify that  "Welcome, Please Sign In!"

@sanity
  Scenario Outline: userShouldLoginAndLogoutWithDifferentCredential
  Given I am on homepage
  When  Click on login link
   And  Enter EmailId "<email>"
   And  Enter Password "<password>"
   And  Click on LoginButton
  Then  Verify Message and Links "<MessageAndLink>"

  Examples:
    |email|password|MessageAndLink|
    |khilenmodi2000@yahoo.com|123@Modi|Login was unsuccessful. Please correct the errors and try again.\nNo customer account found|
    |khilenmodi2003@yahoo.com|khilen123|Logout|
    |khilenmodi2003@yahoo.com|khilen123|check |