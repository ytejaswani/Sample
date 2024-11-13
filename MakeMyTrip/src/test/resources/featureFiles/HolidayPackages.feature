 Feature: Holiday Packages

Scenario: Validate user is able to select Holiday packages with flights

Given Browser should be Launched and url is navigated 
When user is able to click on Holiday Packages link
And navigates to holiday packages page
And User should be on Holiday Package page
And User should enter all valid credentials regarding trip
And click on search buttons
And Now select package from package by clicking with flights
Then Browser should be closed
        
