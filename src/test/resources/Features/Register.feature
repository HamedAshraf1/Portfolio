Feature: Register


  Scenario: Register On web page
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify New User Signup! is visible
    When Enter Name and Email and click signup button
    Then Verify ENTER ACCOUNT INFORMATION is visible
    When Enter all data in registration page
    Then Verify ACCOUNT CREATED! is visible
    When Click on Continue button
    Then Verify Logged in as username is visible
    When Click on Delete Account button
    Then Verify ACCOUNT DELETED! is visible
    Then click continue button


  Scenario: Register User with existing email
    Given Navigate to url
    When Enter Name And Exist Email and click signup button
    Then Verify Email Address already exist! is visible



