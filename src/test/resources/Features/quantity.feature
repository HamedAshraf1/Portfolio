Feature: Product Quantity
  Scenario: Verify Product quantity in Cart
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When The user clicks View Product for any product on home page
    Then Verify product detail is opened
    When The user increases quantity to 4
    And The user clicks Add to cart button
    And click View Cart button
    Then Verify that product is displayed in cart page with exact quantity