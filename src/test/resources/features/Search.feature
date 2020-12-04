Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search

  Background: User should be on google search page
    Given User is on the google search page

  Scenario: Google default title verification
    Given User is on the google search page
    Then User should see title is Google

  Scenario: Google title verification after search

    When User searches apple
    Then User should see apple in the title

  @wip
  Scenario:
    When User searches "apple"
    Then User should see "apple" in the title
    

   #option and return button to generate step definition
  Scenario: Google -About- link page title verification
    Then User should see About link
    And User clicks to About link
    Then User should see title Google - About Google, Our Culture & Company News
@googleTable
  Scenario: google search page footer links verification
    Then user should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Setting          |
    #command option L to make it even





