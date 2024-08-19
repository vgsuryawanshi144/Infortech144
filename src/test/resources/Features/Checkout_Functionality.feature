Feature: Checkout Functionality

  # Verify checkout page loading
  Scenario: Verify the checkout page loads correctly
    Given the user has items in the cart
    When the user navigates to the checkout page
    Then the checkout page should load correctly

  # Verify billing and shipping address forms
  Scenario: Verify the billing address form
    Given the user is on the checkout page
    Then the billing address form should be visible and functional

  Scenario: Verify the shipping address form
    Given the user is on the checkout page
    Then the shipping address form should be visible and functional

  # Verify shipping and payment methods
  Scenario: Verify selecting a shipping method
    Given the user is on the checkout page
    When the user selects a shipping method
    Then the selected shipping method should be applied

  Scenario: Verify selecting a payment method
    Given the user is on the checkout page
    When the user selects a payment method
    Then the selected payment method should be applied

  # Verify order summary and completion
  Scenario: Verify the order summary
    Given the user is on the checkout page
    Then the order summary should display correct information

  Scenario: Verify completing a purchase with a credit card
    Given the user is on the checkout page
    When the user completes a purchase with a credit card
    Then the purchase should be completed successfully

  Scenario: Verify completing a purchase with PayPal
    Given the user is on the checkout page
    When the user completes a purchase with PayPal
    Then the purchase should be completed successfully

  Scenario: Verify completing a purchase with a bank transfer
    Given the user is on the checkout page
    When the user completes a purchase with a bank transfer
    Then the purchase should be completed successfully

  # Verify order confirmation and history
  Scenario: Verify the order confirmation email is sent
    Given the user has completed a purchase
    Then an order confirmation email should be sent

  Scenario: Verify the user is redirected to the order confirmation page
    Given the user has completed a purchase
    Then the user should be redirected to the order confirmation page

  Scenario: Verify the billing address is saved
    Given the user has completed a purchase
    Then the billing address should be saved in the user's account

  Scenario: Verify the shipping address is saved
    Given the user has completed a purchase
    Then the shipping address should be saved in the user's account

  Scenario: Verify the order is saved in the user's order history
    Given the user has completed a purchase
    Then the order should be saved in the user's order history

  Scenario: Verify the order status is updated
    Given the user has completed a purchase
    When the order status is updated
    Then the updated order status should be reflected

  # Verify address editing during checkout
  Scenario: Verify editing the billing address during checkout
    Given the user is on the checkout page
    When the user edits the billing address
    Then the updated billing address should be applied

  Scenario: Verify editing the shipping address during checkout
    Given the user is on the checkout page
    When the user edits the shipping address
    Then the updated shipping address should be applied

  # Verify multiple addresses and payment methods
  Scenario: Verify the checkout page supports multiple shipping addresses
    Given the user is on the checkout page
    When the user adds multiple shipping addresses
    Then the checkout page should support multiple shipping addresses

  Scenario: Verify the checkout page supports multiple payment methods
    Given the user is on the checkout page
    When the user adds multiple payment methods
    Then the checkout page should support multiple payment methods

  # Verify guest checkout functionality
  Scenario: Verify guest checkout functionality
    Given the user is on the checkout page
    When the user chooses to checkout as a guest
    Then the guest checkout process should be completed successfully

  # Verify additional features and error handling
  Scenario: Verify the "Save for Later" feature in the checkout
    Given the user is on the checkout page
    When the user saves items for later
    Then the items should be saved for later and removed from the cart

  Scenario: Verify the checkout page handles out-of-stock items
    Given the user has out-of-stock items in the cart
    When the user proceeds to checkout
    Then the out-of-stock items should be handled appropriately

  Scenario: Verify the checkout page handles expired payment methods
    Given the user is on the checkout page
    When the user attempts to use an expired payment method
    Then an error message should be displayed

  Scenario: Verify the "Apply Gift Card" functionality
    Given the user is on the checkout page
    When the user applies a gift card
    Then the gift card value should be applied to the order

  Scenario: Verify the promo code functionality
    Given the user is on the checkout page
    When the user applies a promo code
    Then the promo code value should be applied to the order

  Scenario: Verify the error handling for invalid promo codes
    Given the user is on the checkout page
    When the user applies an invalid promo code
    Then an error message should be displayed

  Scenario: Verify the tax calculation
    Given the user is on the checkout page
    When the user completes a purchase
    Then the tax should be calculated correctly

  Scenario: Verify the shipping cost calculation
    Given the user is on the checkout page
    When the user completes a purchase
    Then the shipping cost should be calculated correctly

  Scenario: Verify the loyalty points redemption
    Given the user is on the checkout page
    When the user redeems loyalty points
    Then the loyalty points should be applied to the order
