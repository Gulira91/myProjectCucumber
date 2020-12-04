Feature: Search
@scenarioOutline
  Scenario Outline: Google title verification  after search
    Given User is on the google search page
    When User searches "<searchValue>"
    Then User should see "<expectedTitle>" in the title

    Examples: Search values I want to search in Google
      | searchValue | expectedTitle |
      | apple       | apple         |
      | kiwi        | kiwi          |
      | orange      | orange        |
      | grape       | grape         |
    # command option L to make even lines