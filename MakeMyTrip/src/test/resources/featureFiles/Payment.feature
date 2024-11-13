Feature: Payment
Scenario: Validate user should be able to proceed to the payment

Given Browser should be Launched and url is navigated 
When user is able to click on Holiday Packages link
And navigates to holiday packages page
And User should be on Holiday Package page
And User should enter all valid credentials regarding trip
And click on search buttons  
And Select the package from the list of packages
And click on payment 
And add the traveller details and click on submit
Then Verify the results


