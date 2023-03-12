Feature: As a user, I want to view car odometer info on the Vehicles Odometers page.

  Background: User is already in the log in page
    Given the user is on the login page


  @wip
  Scenario Outline: Store and sales managers should see an error message “You do not have permission to perform this action.”
  when they click the “Vehicle Odometer” module.
    Given the user logged in as "<userType>"
    Then user navigates to "Vehicle odometer" module
    Then user sees a “You do not have permission to perform this action.” error message

    Examples:
      | userType      |
      | sales manager |
      | store manager |



    @wip
    Scenario: Drivers should see the default page as 1.
      When user signs in as Driver
      Then user navigates to "Vehicle odometer" module
      Then user should see default page as "1"

      @wip
      Scenario: Divers should see the View Per Page is 25 by default.
        When user signs in as Driver
        Then user navigates to "Vehicle odometer" module
        Then user should see View Per Page is "25" by default




