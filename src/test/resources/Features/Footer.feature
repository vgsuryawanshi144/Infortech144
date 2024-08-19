Feature: Website Pages and Responsiveness

  # "About Us" Page
  Scenario: Ensure that the "About Us" page loads correctly, displaying all relevant information without errors
    Given the user is on the "About Us" page
    Then the page should load successfully
    And all relevant information should be displayed without errors

  # "Privacy Policy" Page
  Scenario: Ensure that the "Privacy Policy" page loads correctly, displaying all relevant information without errors
    Given the user is on the "Privacy Policy" page
    Then the page should load successfully
    And all relevant information should be displayed without errors

  # "Terms & Conditions" Page
  Scenario: Ensure that the "Terms & Conditions" page loads correctly, displaying all relevant information without errors
    Given the user is on the "Terms & Conditions" page
    Then the page should load successfully
    And all relevant information should be displayed without errors

  # "Return Policy" Page
  Scenario: Ensure that the "Return Policy" page loads correctly, displaying all relevant information without errors
    Given the user is on the "Return Policy" page
    Then the page should load successfully
    And all relevant information should be displayed without errors

  # "FAQs" Page
  Scenario: Ensure that the "FAQs" page loads correctly, displaying all relevant information without errors
    Given the user is on the "FAQs" page
    Then the page should load successfully
    And all relevant information should be displayed without errors

  # "Sitemap" Page
  Scenario: Ensure that the "Sitemap" page loads correctly, displaying all relevant links without errors
    Given the user is on the "Sitemap" page
    Then the page should load successfully
    And all relevant links should be displayed without errors

  # Mobile Responsiveness
  Scenario: Ensure that the website loads correctly on mobile devices, displaying all elements properly
    Given the user is on a mobile device
    When the user navigates to the website
    Then the website should load successfully
    And all elements should be displayed properly

  # Tablet Responsiveness
  Scenario: Ensure that the website loads correctly on tablets, displaying all elements properly
    Given the user is on a tablet
    When the user navigates to the website
    Then the website should load successfully
    And all elements should be displayed properly

  # Browser Compatibility
  Scenario: Ensure that the website loads correctly on different browsers (Chrome, Firefox, Safari, Edge)
    Given the user is on a supported browser
    When the user navigates to the website
    Then the website should load successfully
    And all elements should be displayed properly

  # Screen Size Responsiveness
  Scenario: Ensure that the website loads correctly on different screen sizes, displaying all elements properly
    Given the user is on a device with a specific screen size
    When the user navigates to the website
    Then the website should load successfully
    And all elements should be displayed properly

  # Page Load Time
  Scenario: Ensure that the website loads within an acceptable time frame (e.g., under 3 seconds)
    Given the user is on the website
    When the page starts loading
    Then the website should load completely within 3 seconds
