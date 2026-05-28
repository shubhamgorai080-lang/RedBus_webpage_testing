Feature: Seat booking and Boarding Functionality

Scenario: Verify the seat selection and Choose board and drop location
Given the user navigates to the bus booking website homepage
When the user enters a valid origin location in the source field
And the user enters a valid destination location in the destination field
And the user selects a valid upcoming travel date from the calendar picker
And user clicks the Search Buses button
Then the user clicks on the View Seats option for an available bus
And User select their seat as per their choice
Then User choose boarding and drop Location