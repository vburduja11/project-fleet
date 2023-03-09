Feature: As a user, I want to view car odometer info on the Vehicles Odometers page.

  Background: User is already in the log in page
    Given the user is on the login page


  @wip
  Scenario: Store managers should see an error message “You do not have permission to perform this action.”
  when they click the “Vehicle Odometer” module.
    When user signs in as Store manager
    Then user navigates to "Vehicle odometer" module
    Then user sees a “You do not have permission to perform this action.” error message

  @wip
  Scenario: Sales managers should see an error message “You do not have permission to perform this action.”
  when they click the “Vehicle Odometer” module.
    When user signs in as Sales manager
    Then user navigates to "Vehicle odometer" module
    Then user sees a “You do not have permission to perform this action.” error message




