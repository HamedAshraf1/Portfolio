Feature: Verify Products

  Scenario: Verify All Products and product detail page
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on product button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then Verify the products list is visible
    When The user clicks on View Product of first product
    Then Verify the user is landed to product detail page
    Then Verify that product detail is visible: product name, category, price, availability, condition, brand