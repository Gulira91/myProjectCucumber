@wiki
Feature: Wiki title verification


  Background: User is on the Wiki home page
    Given User is on the Wikipedia page


  Scenario: Search functionality title verification
    When User searches "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" in the wiki title


  Scenario Outline: Search functionality header verification
    When User searches "<searchValue>" in the wiki search page
    Then User should see "<expectedInTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedHeader>" in the image header

    Examples:
      | searchValue     | expectedInTitle | expectedMainHeader | expectedHeader  |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs      |
      | Dua Lipa        | Dua Lipa        | Dua Lipa           | Dua Lipa        |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein |
      |Thomas Edison    |Thomas Edison    |Thomas Edison       |Thomas Edison     |

