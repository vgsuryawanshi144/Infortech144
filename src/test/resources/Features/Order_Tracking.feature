Feature: Order Tracking and Order History

  # Order Tracking Page
  Scenario: Ensure that the order tracking page loads correctly and all elements are displayed as expected
    Given the user is on the order tracking page
    Then the page should load successfully
    And the order tracking number input field should be visible
    And the "Track Order" button should be visible
    And the order status section should be visible
    And the order details section should be visible

  # Tracking an Order with Valid Tracking Number
  Scenario: Ensure that tracking an order with a valid tracking number returns the correct order details and status
    Given the user is on the order tracking page
    When the user enters a valid tracking number
    And clicks on the "Track Order" button
    Then the order details should be displayed
    And the order status should be updated to reflect the current state of the order

  # Tracking an Order with Invalid Tracking Number
  Scenario: Ensure that tracking an order with an invalid tracking number returns an appropriate error message
    Given the user is on the order tracking page
    When the user enters an invalid tracking number
    And clicks on the "Track Order" button
    Then an error message indicating the tracking number is invalid should be displayed

  # Order Status Updates
  Scenario: Ensure that the order status updates correctly reflect the current state of the order
    Given the user has tracked an order
    When the order status changes
    And the user refreshes the order tracking page
    Then the updated order status should be displayed correctly

  # Order History
  Scenario: Ensure that the order history is displayed correctly for a user, showing all past orders with accurate details
    Given the user is logged in
    When the user navigates to the order history page
    Then the order history should be displayed
    And all past orders should be listed with accurate details (order number, date, status, total amount)

  # Order Details Page
  Scenario: Ensure that the order details page loads correctly and displays comprehensive details about a specific order
    Given the user is logged in
    And the user is on the order history page
    When the user selects a specific order from the list
    Then the order details page should load successfully
    And comprehensive details about the specific order should be displayed (order number, items, quantities, prices, shipping information, tracking number, status)
