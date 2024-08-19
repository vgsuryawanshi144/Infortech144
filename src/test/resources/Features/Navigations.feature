Feature: Navigation Links Functionality

  Scenario: Verify Home Link Displayed
    Given the user is on the homepage
    Then the Home link should be displayed

  Scenario: Verify Product Link Displayed
    Given the user is on the homepage
    Then the Product link should be displayed

  Scenario: Verify Services Link Displayed
    Given the user is on the homepage
    Then the Services link should be displayed

  Scenario: Verify What's New Link Displayed
    Given the user is on the homepage
    Then the What's New link should be displayed

  Scenario: Verify Contact Us Link Displayed
    Given the user is on the homepage
    Then the Contact Us link should be displayed

  Scenario: Verify Home Link Navigation
    Given the user is on the homepage
    When the user clicks the Home link
    Then the user should be navigated to the home page

  Scenario: Verify Product Link Navigation
    Given the user is on the homepage
    When the user clicks the Product link
    Then the user should be navigated to the products page

  Scenario: Verify Services Link Navigation
    Given the user is on the homepage
    When the user clicks the Services link
    Then the user should be navigated to the services page

  Scenario: Verify What's New Link Navigation
    Given the user is on the homepage
    When the user clicks the What's New link
    Then the user should be navigated to the what's new page

  Scenario: Verify Contact Us Link Navigation
    Given the user is on the homepage
    When the user clicks the Contact Us link
    Then the user should be navigated to the contact us page
