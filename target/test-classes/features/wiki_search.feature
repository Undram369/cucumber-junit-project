Feature: Wikipedia Search Functionality and verification

  Background:
    Given User is on Wikipedia home page

  Scenario:  Wikipedia Search Functionality Title Verification
    # Given User is on Wikipedia home page
    When user types Steve Jobs in the wiki search box
    And user clicks wiki search button
    Then user sees Steve Jobs is in the wiki title


  Scenario:  Wikipedia Search Functionality Title Verification
    #Given User is on Wikipedia home page
    When user types "Bill Gates" in the wiki search box
    And user clicks wiki search button
    Then user sees "Bill Gates" is in the wiki title

  @scenarioOutlinePractice
  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT
   # Given User is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedTitle>" is in the wiki title

    Examples:
      | searchValue     | expectedTitle   |
      | Steve Jobs      | Steve Jobs      |
      | Elon Musk       | Elon Musk       |
      | Nikola Tesla    | Nikola Tesla    |
      | Chuck Norris    | Chuck Norris    |
      | Albert Einstein | Albert Einstein |




