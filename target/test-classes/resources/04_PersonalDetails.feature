Feature: personal details of the user for booking functionality

Scenario: Verify that user fill their details in their field
Given the user navigates to the bus booking website homepage
When the user enters a valid origin location in the source field
And the user enters a valid destination location in the destination field
And the user selects a valid upcoming travel date from the calendar picker
And user clicks the Search Buses button
Then the user clicks on the View Seats option for an available bus
And User select their seat as per their choice
When User choose boarding and drop Location
And User enter their Phone Number in mobile field
And User enter their email Id in email field
And User Choose their Current location State
And User Enter their Name Age 
And choose their gender
And User choose their mode of Cancellation Insurance
Then Click on Booking Button