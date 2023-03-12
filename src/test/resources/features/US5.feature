Feature: Vehicle Models Page Web-Table

  Background: User is already in the log in page
    Given the user is on the login page

  @test@B28G29-165@wip
  Scenario: US5AC1TC1 Verify users can see 10 columns on the Vehicle Model page
    Given the user logged in as "Store Manager"
    And the user click on the Vehicle Model under the Fleet
    Then the user should see following column options

      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |


  @test@B28G29-166@wip
  Scenario: US5AC2TC1 Verify users login as Drivers should not able to access the Vehicle Model page, and they should
  see "You do not have permission to perform this action."
    Given the user logged in as "Driver"
    And the user click on the Vehicle Model under the Fleet
    Then the user should see the error message ""You do not have permission to perform this action."