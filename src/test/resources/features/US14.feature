Feature: Marketing Page

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: US14AC1TC1 Verify  managers see default checked filters on the Campaigns page
    Given the user logged in as "<userType>"
    And the user navigate to "<tab>" - "<module>"
    And user navigate to Filters and click
    And user navigate to Manage filters and click
    Then user should see all five options are checked by default

    Examples:
      | userType      | tab       | module    |
      | store manager | Marketing | Campaigns |
      | sales manager | Marketing | Campaigns |
