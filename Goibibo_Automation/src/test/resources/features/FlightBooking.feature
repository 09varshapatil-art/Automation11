Feature: To verify all flights booking.

Scenario: Verify user can book Round Trip flight.
Given User open the application
Given User click on PopUp1 option  
And User click on PopUp2 option  
And User select Round Trip button
When User enter "Pune" and select the departure city
And User enter "Nagpur" and select the arrival city
And User select the travel date
And User select the return date
Then User click on search button
