@mike
Feature: Description when creating a calendar event.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US8AC1TC1 user see the default repeat day as 1
    Given the user logged in as "sales manager"
    Then the user navigate to "Activities" - "Calendar Events"
    Then click the "Create Calendar Event" button
    Then write a message in the Description field
    And verify the message is written in the input box