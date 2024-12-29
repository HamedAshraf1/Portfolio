Feature: Remove Products

  Scenario: Remove Products From Cart
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And Click on Cart button
    Then Verify that cart page is displayed
    When The user clicks X button corresponding to particular product
    Then Verify that product is removed from the cart