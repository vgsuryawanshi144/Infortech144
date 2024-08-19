Feature: Cart Functionality

  # Verify cart interactions
  Scenario: Verify adding a product to the cart
    Given the user is on a product page
    When the user adds the product to the cart
    Then the product should be added to the cart successfully

  Scenario: Verify updating the quantity of a product in the cart
    Given the user has a product in the cart
    When the user updates the quantity of the product
    Then the cart should reflect the updated quantity

  Scenario: Verify removing a product from the cart
    Given the user has a product in the cart
    When the user removes the product from the cart
    Then the product should be removed from the cart successfully

  Scenario: Verify the cart updates the total price correctly
    Given the user has products in the cart
    When the user updates quantities or removes products
    Then the cart should update the total price correctly

  Scenario: Verify the cart persists after page refresh
    Given the user has products in the cart
    When the user refreshes the page
    Then the products should remain in the cart

  # Verify cart buttons
  Scenario: Verify the "Continue Shopping" button
    Given the user is viewing the cart
    Then the "Continue Shopping" button should be visible and clickable

  Scenario: Verify the "Proceed to Checkout" button
    Given the user is viewing the cart
    Then the "Proceed to Checkout" button should be visible and clickable

  # Verify cart content display
  Scenario: Verify the cart displays product thumbnails
    Given the user has products in the cart
    Then the cart should display product thumbnails

  Scenario: Verify the cart displays product names
    Given the user has products in the cart
    Then the cart should display product names

  Scenario: Verify the cart displays product prices
    Given the user has products in the cart
    Then the cart should display product prices

  # Verify discount functionality
  Scenario: Verify applying a discount code
    Given the user is viewing the cart
    When the user applies a discount code
    Then the discount code should be applied correctly

  Scenario: Verify the cart displays the total price before discount
    Given the user is viewing the cart
    When the discount code is not applied
    Then the cart should display the total price before discount

  Scenario: Verify the cart displays the total price after discount
    Given the user is viewing the cart
    When the discount code is applied
    Then the cart should display the total price after discount

  # Verify shipping and tax calculations
  Scenario: Verify the shipping cost is calculated correctly
    Given the user is viewing the cart
    When the user enters shipping information
    Then the shipping cost should be calculated correctly

  Scenario: Verify the tax is calculated correctly
    Given the user is viewing the cart
    When the user enters tax information
    Then the tax should be calculated correctly
