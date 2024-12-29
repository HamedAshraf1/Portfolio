Feature: Home

  Scenario: home page is visible successfully
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully

  Scenario: TestCases Page is visible successfully
    When Click on test case button
    Then Verify user is navigated to test cases page successfully
