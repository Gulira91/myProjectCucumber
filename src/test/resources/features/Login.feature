@login
  #if we put on top it will run the whole file
Feature: Login feature

  Agile story: As a user , I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed.
  #tags we use them for group scenarios, and we use or, and, not , to group scenarios and run them together
  #we need to press command to go to methods
  @librarian @employee
  Scenario: Librarian login scenario
    Given User on the login page
    When User logs in librarian
    Then User should see dashboard
# we can give more tags to one scenario
  @student
  Scenario: Student  login scenario
    Given User on the login page
    When User logs in student
    Then User should see dashboard


  @admin @employee
  Scenario: Admin login scenario
    Given User on the login page
    When User logs in admin
    Then User should see dashboard



