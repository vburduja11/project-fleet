Feature: main modules

  Background: User is already in the log in page
    Given the user is on the login page



  Scenario: As a store manager, I should be accessing all the main modules of the app.
    Given the user logged in as "store manager"
    Then Store manager can see modules
      |Dashboards        |
      |Fleet             |
      |Customers         |
      |Sales             |
      |Activities        |
      |Marketing         |
      |Reports & Segments|
      |System            |




  Scenario: As a sales manager, I should be accessing all the main modules of the app.
    Given the user logged in as "sales manager"
    Then Store manager can see modules
      |Dashboards        |
      |Fleet             |
      |Customers         |
      |Sales             |
      |Activities        |
      |Marketing         |
      |Reports & Segments|
      |System            |

  Scenario: As a driver, I should see  should view 4 module names
    Given the user logged in as "driver"
    Then Driver can see modules
      |Fleet             |
      |Customers         |
      |Activities        |
      |System            |