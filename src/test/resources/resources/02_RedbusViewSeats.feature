Feature: View seats Functionality
Scenario: Verify that the user is able to view available bus seats successfully
Given the user navigates to the bus booking website homepage
When the user enters a valid origin location in the source field
And the user enters a valid destination location in the destination field
And the user selects a valid upcoming travel date from the calendar picker
And user clicks the Search Buses button
Then the user clicks on the View Seats option for an available bus