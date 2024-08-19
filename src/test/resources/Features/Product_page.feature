Feature: Product Page Functionality

  # Verify the product page
  Scenario: Verify the product page loads correctly
    Given the user is on a product page
    Then the product page should load successfully

  # Verify product details
  Scenario: Verify the product image is displayed
    Given the user is on a product page
    Then the product image should be displayed

  Scenario: Verify the product image can be zoomed
    Given the user is on a product page
    When the user zooms in on the product image
    Then the zoomed image should be displayed correctly

  Scenario: Verify the product title is displayed
    Given the user is on a product page
    Then the product title should be displayed

  Scenario: Verify the product price is displayed
    Given the user is on a product page
    Then the product price should be displayed

  Scenario: Verify the product description is displayed
    Given the user is on a product page
    Then the product description should be displayed

  Scenario: Verify the product specifications are displayed
    Given the user is on a product page
    Then the product specifications should be displayed

  Scenario: Verify the product reviews are displayed
    Given the user is on a product page
    Then the product reviews should be displayed

  # Verify interactive elements
  Scenario: Verify the "Add to Cart" button
    Given the user is on a product page
    Then the "Add to Cart" button should be displayed and clickable

  Scenario: Verify the "Add to Wishlist" button
    Given the user is on a product page
    Then the "Add to Wishlist" button should be displayed and clickable

  Scenario: Verify the "Compare" button
    Given the user is on a product page
    Then the "Compare" button should be displayed and clickable

  # Verify additional sections
  Scenario: Verify the related products section
    Given the user is on a product page
    Then the related products section should be displayed

  Scenario: Verify the breadcrumb navigation
    Given the user is on a product page
    Then the breadcrumb navigation should be displayed

  Scenario: Verify the product availability status
    Given the user is on a product page
    Then the product availability status should be displayed

  Scenario: Verify the product SKU is displayed
    Given the user is on a product page
    Then the product SKU should be displayed

  Scenario: Verify the quantity selector
    Given the user is on a product page
    Then the quantity selector should be displayed and functional
