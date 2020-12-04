@loginWithBackground
#only pre conditions only , no after it runs top to bottom

Feature: Login feature

  Agile story: As a user , I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed.

  Background: User is on the login page
    Given User on the login page



  Scenario: Librarian login scenario

    When User logs in librarian
    Then User should see dashboard

  @db
  Scenario: Student  login scenario

    When User logs in student
    Then User should see dashboard



  Scenario: Admin login scenario

    When User logs in admin
    Then User should see dashboard


