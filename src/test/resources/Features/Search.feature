Feature: Search

  @search1
  Scenario: Search Product
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on product button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When The user enters product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to search are visible



  @search2
  Scenario: Search Products and Verify Cart After Login
    Given Navigate to url
    When Get the page title
    When Click on product button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When The user enters product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to search are visible
    When Add Product To Cart
    And The user clicks Continue Shopping button
    And Click on Cart button
    Then Verify that products are visible in cart
    When Click on Signup button
    And Enter Correct Email and Password And Click Login Button
    And Click on Cart button
    Then Verify that products are visible in cart




