Feature: Homepage Functionality

  Scenario: Verify Homepage Loads and Essential Elements
    Given the homepage is loaded
    Then the site logo should be visible
    When I click on the site logo
    Then I should be redirected to the homepage

  Scenario: Verify Navigation Menu and Links
    Then the main navigation menu should be visible
    When I click on the "Home" link
    Then I should be redirected to the homepage
    When I click on the "Products" link
    Then I should be redirected to the Products page
    When I click on the "About Us" link
    Then I should be redirected to the About Us page
    When I click on the "Contact Us" link
    Then I should be redirected to the Contact Us page

  Scenario: Verify Search Functionality
    Then the search bar should be visible
    When I enter text into the search bar
    And I perform a search
    Then the search results should be displayed

  Scenario: Verify Homepage Sections
    Then the banner image should be visible
    Then the "Featured Products" section should be visible
    Then the "Special Offers" section should be visible
    Then the "Latest News" section should be visible

  Scenario: Verify Footer and Social Media
    Then the footer should be visible
    When I click on the footer links
    Then I should be redirected to the appropriate pages
    Then the social media icons should be visible

  Scenario: Verify Newsletter Subscription
    Then the "Subscribe to Newsletter" field should be visible
    And the "Subscribe to Newsletter" button should be visible and clickable
