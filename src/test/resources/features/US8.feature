@mike
Feature: Recurring calendar event

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US8AC1TC1 user see the default repeat day as 1
    Given the user logged in as "driver"
    Then the user navigate to "Activities" - "Calendar Events"
    Then click the "Create Calendar Event" button
    Then check the Repeat checkbox
    And verify the repeat number is 1


  Scenario: US8AC2TC2 users clear the repeat day and see an error message
    Given the user logged in as "driver"
    Given the user navigate to "Activities" - "Calendar Events"
    Then click the "Create Calendar Event" button
    Then check the Repeat checkbox
    Then the user clear(delete) the number 1
    And verify the app displays "This value should not be blank"
