Feature: Add Product

  Scenario: Add Products in Cart
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on product button
    And The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks View Cart button
    Then Verify both products are added to Cart
    Then Verify their prices, quantity and total price