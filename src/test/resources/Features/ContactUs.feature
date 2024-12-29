Feature: ContactUs Form

  Scenario: Contact Us Form
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on ContactUs Button
    Then Verify GET IN TOUCH is visible
    When The user enters name, email, subject and message
    And The user uploads file
    And The User clicks Submit button
    And The user clicks OK button
    Then Verify success message Your details have been submitted successfully is visible
    When Click on Home Button
    Then Verify that home page is visible successfully


