Feature: Registration Functionality

  Scenario: Verify Successful Registration
    Given the user is on the registration page
    When the user registers with valid details
    Then the registration should be successful

  Scenario: Verify Empty First Name Error
    Given the user is on the registration page
    When the user registers without a first name
    Then an error message for the first name should be displayed

  Scenario: Verify Empty Last Name Error
    Given the user is on the registration page
    When the user registers without a last name
    Then an error message for the last name should be displayed

  Scenario: Verify Empty Email Error
    Given the user is on the registration page
    When the user registers without an email
    Then an error message for the email should be displayed

  Scenario: Verify Empty Password Error
    Given the user is on the registration page
    When the user registers without a password
    Then an error message for the password should be displayed

  Scenario: Verify Password Mismatch Error
    Given the user is on the registration page
    When the user registers with mismatched passwords
    Then an error message for password mismatch should be displayed

  Scenario: Verify Email Already Registered Error
    Given the user is on the registration page
    When the user registers with an already registered email
    Then an error message for already registered email should be displayed
