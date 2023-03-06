Feature: Vehicle contracts

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify user can access the Vehicle contracts page
    Given the user logged in as "sales manager"
    And the user navigate to "Fleet" - "Vehicle Contracts"

  Scenario: Verify user can not access the Vehicle contracts page
    Given the user logged in as "driver"
    And the user navigate to "Fleet" - "Vehicle Contracts"
    Then user should see an error message "You do not have permission to perform this action."

