Feature: Login

  Scenario: Login User with incorrect email and password
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify Login to your account is visible
    When Enter InCorrect Email and Password And Click Login Button
    Then Verify error Your email or password is incorrect! is visible


  Scenario: Logout User
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify Login to your account is visible
    When Enter Correct Email and Password And Click Login Button
    And Click On Logout Button
    Then Verify that user is navigated to login page

  Scenario: Login with correct email and correct password
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify Login to your account is visible
    When Enter Correct Email and Password And Click Login Button
    And Click on Delete Account button
    Then Verify ACCOUNT DELETED! is visible
