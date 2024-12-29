Feature: View and Cart

  Scenario: View & Cart Brand Products
    Given Navigate to url
    When Get the page title
    When Click on product button
    Then Verify that Brands are visible on left side bar
    When The user clicks on left side bar brand name Polo
    Then Verify that user is navigated to brand page and brand products are displayed
    When The user clicks on other brand link such as HM
    Then Verify that user is navigated to brand page HM and brand products are displayed

