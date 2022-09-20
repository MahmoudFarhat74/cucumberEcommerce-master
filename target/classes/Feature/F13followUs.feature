@regression

Feature: followUS successful
  Scenario: followus
    When user navigates to homepage to try follow us option
    And user clicks on facebook logo under follow us label
    And user clicks on twitter logo under follow us label
    And user clicks on third logo under follow us label
    And user clicks on youtube logo under follow us label
    Then a new tab directing to facebook page should be opened
    Then a new tab directing to twitter page should be opened
    Then a new tab directing to third page should be opened
    Then a new tab directing to youtube page should be opened

