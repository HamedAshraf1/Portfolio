Feature: Place Order

  @placeOrder1
  Scenario: Register while Checkout
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And Click on Cart button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    And The user clicks Register-Login button
    When Enter Name and Email and click signup button
    And Enter all data in registration page
    Then Verify ACCOUNT CREATED! is visible
    When Click on Continue button
    Then Verify Logged in as username is visible
    When Click on Cart button
    And The user clicks Proceed To Checkout button
    Then Verify Address Details and Review User's Order
    When The user enters description in comment text area and click Place Order
    And The user enters payment details: Name on Card, Card Number, CVC, Expiration date
    And The user clicks Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    When Click on Delete Account button
    Then Verify ACCOUNT DELETED! is visible
    Then click continue button


  @placeOrder2
  Scenario: Register before Checkout
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on Signup button
    And Enter Name and Email and click signup button
    And Enter all data in registration page
    Then Verify ACCOUNT CREATED! is visible
    When Click on Continue button
    Then Verify Logged in as username is visible
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And Click on Cart button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    Then Verify Address Details and Review User's Order
    When The user enters description in comment text area and click Place Order
    And The user enters payment details: Name on Card, Card Number, CVC, Expiration date
    And The user clicks Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    When Click on Delete Account button
    Then Verify ACCOUNT DELETED! is visible
    Then click continue button


  @placeOrder3
  Scenario: login before Checkout
    Given Navigate to url
    When Get the page title
    Then Verify that home page is visible successfully
    When Click on Signup button
    When Enter Correct Email and Password And Click Login Button
    And The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And Click on Cart button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    Then Verify Address Details and Review User's Order
    When The user enters description in comment text area and click Place Order
    And The user enters payment details: Name on Card, Card Number, CVC, Expiration date
    And The user clicks Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    When Click on Delete Account button
    Then Verify ACCOUNT DELETED! is visible
    Then click continue button









