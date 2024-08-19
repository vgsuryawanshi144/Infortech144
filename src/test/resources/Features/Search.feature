Feature: Search Functionality

  # Verify search functionality with different types of input
  Scenario: Verify the search functionality with a valid product name
    Given the user is on the homepage
    When the user performs a search with the product name "Valid Product"
    Then the search results should be displayed with products matching "Valid Product"

  Scenario: Verify the search functionality with an invalid product name
    Given the user is on the homepage
    When the user performs a search with the product name "Invalid Product"
    Then the search results should display a message indicating no results found

  Scenario: Verify the search functionality with a partial product name
    Given the user is on the homepage
    When the user performs a search with the product name "Partial"
    Then the search results should display products containing "Partial" in their names

  Scenario: Verify the search functionality with a category name
    Given the user is on the homepage
    When the user performs a search with the category name "Electronics"
    Then the search results should display products in the "Electronics" category

  # Verify search results page
  Scenario: Verify the search results page loads correctly
    Given the user is on the homepage
    When the user performs a search with the product name "Valid Product"
    Then the search results page should load successfully

  # Verify filtering search results
  Scenario: Verify filtering search results by price
    Given the user is on the search results page
    When the user applies a filter for price range "$50 to $100"
    Then the search results should display products within the price range "$50 to $100"

  Scenario: Verify filtering search results by brand
    Given the user is on the search results page
    When the user applies a filter for the brand "Brand A"
    Then the search results should display products from "Brand A"

  Scenario: Verify filtering search results by rating
    Given the user is on the search results page
    When the user applies a filter for rating "4 stars and up"
    Then the search results should display products with a rating of "4 stars and up"

  # Verify sorting search results
  Scenario: Verify sorting search results by relevance
    Given the user is on the search results page
    When the user sorts the results by "Relevance"
    Then the search results should be sorted by relevance

  Scenario: Verify sorting search results by price (low to high)
    Given the user is on the search results page
    When the user sorts the results by "Price: Low to High"
    Then the search results should be sorted by price from low to high

  Scenario: Verify sorting search results by price (high to low)
    Given the user is on the search results page
    When the user sorts the results by "Price: High to Low"
    Then the search results should be sorted by price from high to low

  Scenario: Verify sorting search results by newest arrivals
    Given the user is on the search results page
    When the user sorts the results by "Newest Arrivals"
    Then the search results should be sorted by the newest arrivals first

  # Verify number of results per page
  Scenario: Verify the number of results per page
    Given the user is on the search results page
    When the user views the number of results per page
    Then the number of results displayed per page should match the expected value (e.g., 20 results per page)
