@etsyAll
Feature: Etsy search feature

  Agile story: User should be able to enter search terms and see
  relevant result in the  page and in the title.

  Scenario: Title verification
    Given User is on the etsy home page
    Then User should see title is as expected

  @etsyWip
    Scenario: Title verification after search term
      When User searches "Wooden spoon" in the search box
      And User clicks to search button
      Then User should see "Wooden spoon" in the Etsy title

