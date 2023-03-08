Feature: Users should be able to select any vehicle
  Agile Story: As a user, I should be able to select any vehicle from the Vehicle page(web table)

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: US7AC1TC1 Verify once the users launch on the Vehicle page, all the checkboxes should be unchecked
    When the user logged in as "<userType>"
    Then the user navigate to "Fleet" - "Vehicles"
    Then user should see all checkboxes should be unchecked

    Examples:
      | userType      |
      | sales manager |
      | store manager |

  @wip
  Scenario: US7AC2TC1 Verify user checks the first checkbox to check all the cars
    When the user logged in as "sales manager"
    Then the user navigate to "Fleet" - "Vehicles"
    Then the user checks the first checkbox
    Then the user should see all checkboxes are selected

  @wip
  Scenario: US7AC3TC1 Verify users can select any car
    When the user logged in as "store manager"
    Then the user navigate to "Fleet" - "Vehicles"
    Then the user checks any checkbox