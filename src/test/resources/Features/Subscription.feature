Feature: Verify Subscription

  Scenario: Verify Subscription in home page
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user enters email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible