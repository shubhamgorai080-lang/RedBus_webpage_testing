Feature: Bus Search Functionality

Scenario: Verify successful bus search with valid locations and travel date
Given the user navigates to the bus booking website homepage
When the user enters a valid origin location in the source field
And the user enters a valid destination location in the destination field
And the user selects a valid upcoming travel date from the calendar picker
Then user clicks the Search Buses button