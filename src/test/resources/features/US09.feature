
Feature: As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.
  Background: User is starting on the login page
    Given the user is on the login page
  @wip
    Scenario Outline:US09AC01TC01/02 Verify repeat numbers can't be less than 0 and more than 99 in the repeat box
      Given User should login into application as a "sales manager"
      When user navigate to "Activities - Calendar Events"
      And user click on Create Calendar Event button
      Then user click on the "repeat every" checkbox
      When repeat fields appear on create calendar event page
      Then user enter "<numbers>" to repeat every checkbox
      Then user should get "<error message>" message



      Examples:
      |Numbers:|Error Messages:                       |
      |100     |The value have not to be more than 99.|
      |0       |The value have not to be less than 1. |



   


