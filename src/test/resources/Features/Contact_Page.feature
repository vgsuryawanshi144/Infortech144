Feature: Contact Page Functionality

  # Contact Page Load
  Scenario: Ensure that the contact page loads correctly and all elements are displayed as expected
    Given the user is on the contact page
    Then the page should load successfully
    And the contact form should be visible
    And the contact details section (phone number, email, address) should be visible
    And the map showing the location of the contact address should be visible

  # Contact Form Display
  Scenario: Ensure that the contact form is displayed correctly on the contact page
    Given the user is on the contact page
    Then the contact form should be visible
    And the contact form should include fields for name, email, phone number, message, and a "Submit" button

  # Submitting Contact Form with Valid Details
  Scenario: Ensure that submitting the contact form with valid details is successful and displays a success message
    Given the user is on the contact page
    When the user enters valid details into the contact form
    And clicks on the "Submit" button
    Then the form should be submitted successfully
    And a success message should be displayed

  # Submitting Contact Form with Invalid Details
  Scenario: Ensure that submitting the contact form with invalid details displays appropriate error messages
    Given the user is on the contact page
    When the user enters invalid details into the contact form
    And clicks on the "Submit" button
    Then the form should not be submitted
    And appropriate error messages should be displayed for the invalid fields

  # Contact Form Validation
  Scenario: Ensure that the contact form validation works correctly, preventing submission of incomplete or incorrect details
    Given the user is on the contact page
    When the user enters incomplete or incorrect details into the contact form
    And clicks on the "Submit" button
    Then the form should not be submitted
    And validation error messages should be displayed for the incomplete or incorrect fields

  # "Submit" Button Functionality
  Scenario: Ensure that the "Submit" button on the contact form is functional and correctly submits the form
    Given the user is on the contact page
    When the user enters valid details into the contact form
    And clicks on the "Submit" button
    Then the form should be submitted successfully
    And the user should receive a confirmation that the form was submitted

  # Contact Details Display
  Scenario: Ensure that the contact details (phone number, email, address) are displayed correctly on the contact page
    Given the user is on the contact page
    Then the contact details section should display the correct phone number
    And the contact details section should display the correct email address
    And the contact details section should display the correct address

  # Map Display
  Scenario: Ensure that the map showing the location of the contact address is displayed correctly on the contact page
    Given the user is on the contact page
    Then the map should display the correct location of the contact address
    And the map should be interactive (if applicable) and functional
