Feature: User Account Management

  # User Registration
  Scenario: Ensure that a new user can successfully register with valid details
    Given the user is on the registration page
    When the user enters valid registration details
    And submits the registration form
    Then the user should be redirected to the login page
    And a success message should be displayed

  Scenario: Ensure that registration fails with appropriate error messages for invalid details
    Given the user is on the registration page
    When the user enters invalid or incomplete registration details
    And submits the registration form
    Then appropriate error messages should be displayed

  # User Login
  Scenario: Ensure that a registered user can log in with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    And submits the login form
    Then the user should be redirected to the user dashboard

  Scenario: Ensure that login fails with appropriate error messages for incorrect credentials
    Given the user is on the login page
    When the user enters incorrect email or password
    And submits the login form
    Then an error message should be displayed

  # Password Reset
  Scenario: Ensure that a user can successfully reset their password using the "Forgot Password" feature
    Given the user is on the login page
    When the user clicks on "Forgot Password"
    And enters their email address
    And submits the form
    Then the user should receive a password reset email
    And be prompted to reset their password

  # Account Information Update
  Scenario: Ensure that a user can update their account information and save changes successfully
    Given the user is logged in
    When the user navigates to the account information page
    And updates their account information
    And saves the changes
    Then the changes should be saved successfully

  Scenario: Ensure that a user can view their order history from their account page
    Given the user is logged in
    When the user navigates to the order history page
    Then the user should be able to view their order history

  # User Logout
  Scenario: Ensure that a user can successfully log out from their account
    Given the user is logged in
    When the user clicks on the "Logout" button
    Then the user should be logged out
    And redirected to the login page

  # Account Deletion
  Scenario: Ensure that a user can delete their account and receive a confirmation message
    Given the user is logged in
    When the user navigates to the account deletion page
    And confirms the deletion of their account
    Then the user should receive a confirmation message
    And their account should be deleted

  # Profile Picture Upload
  Scenario: Ensure that a user can upload a profile picture successfully
    Given the user is logged in
    When the user navigates to the profile picture upload section
    And uploads a profile picture
    Then the profile picture should be uploaded successfully

  # Password Change
  Scenario: Ensure that a user can change their password successfully
    Given the user is logged in
    When the user navigates to the change password section
    And enters a new password
    And saves the changes
    Then the password should be changed successfully

  # Address Management
  Scenario: Ensure that a user can add and save multiple addresses to their account
    Given the user is logged in
    When the user navigates to the address management section
    And adds multiple addresses
    And saves the addresses
    Then the addresses should be saved successfully

  Scenario: Ensure that a user can edit and save changes to an existing address
    Given the user is logged in
    When the user navigates to the address management section
    And edits an existing address
    And saves the changes
    Then the address should be updated successfully

  # Session Timeout
  Scenario: Ensure that an active session times out after inactivity
    Given the user is logged in
    When the user remains inactive for a period of time
    Then the user should be logged out automatically
    And redirected to the login page

  # Error Messages
  Scenario: Ensure that all error messages are clear and user-friendly
    Given the user is on a form page
    When the user submits invalid or incomplete information
    Then the error messages should be clear and accurately describe the issue

  Scenario: Ensure that the system prevents registration with an email already in use
    Given the user is on the registration page
    When the user enters an email that is already in use
    And submits the registration form
    Then an error message indicating the email is already in use should be displayed

  # Navigation and UI Elements
  Scenario: Ensure that all navigation and call-to-action buttons are clear and identifiable
    Given the user is on any page
    Then all navigation and call-to-action buttons should be clear and easily identifiable

  Scenario: Ensure that the email field is located in the Contact tab of the profile section
    Given the user is on the profile section
    Then the email field should be located in the Contact tab

  Scenario: Ensure that the Password tab is highlighted to indicate the current section
    Given the user is on the profile section
    When the user selects the Password tab
    Then the Password tab should be highlighted

  Scenario: Ensure that the generic error message "This is a required field" is displayed accurately
    Given the user is on a form page
    When the user submits a required field without entering information
    Then the message "This is a required field" should be displayed where applicable

  Scenario: Ensure that informational text is placed below the email and password fields
    Given the user is on a form page
    Then informational text should be placed below the email and password fields to avoid confusion
