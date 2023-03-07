Feature: Vehicle contracts

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: US4AC1TC1 Verify user can access the Vehicle contracts page
    Given the user logged in as "<userType>"
    And the user navigate to "<tab>" - "<module>"
    Then the title contains "<title>"
    Then the page url is "<url>"

    Examples:
      | userType      | tab   | module            | title                                                                | url                                                           |
      | sales manager | Fleet | Vehicle Contracts | All - Vehicle Contract - Entities - System - Car - Entities - System | https://qa.intabella.com/entity/Extend_Entity_VehicleContract |
      | store manager | Fleet | Vehicle Contracts | All - Vehicle Contract - Entities - System - Car - Entities - System | https://qa.intabella.com/entity/Extend_Entity_VehicleContract |


  Scenario: US4AC2TC2 Verify user can not access the Vehicle contracts page
    Given the user logged in as "driver"
    And the user navigate to "Fleet" - "Vehicle Contracts"
    Then user should see an error message "You do not have permission to perform this action."

