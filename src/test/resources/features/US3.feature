Feature: Users should able to learn how to use pinbar
  Agile Story: As a user, I want to learn how to use the pinbar

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US3AC1TC1 Verify user learn how to use the pinbar
    When the user logged in as "driver"
    Then user click the pinbarLink on the homepage
    Then user see first message "How To Use Pinbar"

  Scenario: US3AC1TC2 Verify user learn how to use the pinbar
    When the user logged in as "driver"
    Then user click the pinbarLink on the homepage
    Then user see second message "Use the pin icon on the right top corner of the page to create fast access link in the pinbar."


  Scenario: US3AC2TC1 Verify users see an image on the pinbar page
    When the user logged in as "driver"
    Then user click the pinbarLink on the homepage
    Then user see pinbarImage



