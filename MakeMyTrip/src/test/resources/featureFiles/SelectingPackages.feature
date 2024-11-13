Feature: Selecting the package
Scenario Outline: Verify user is able to select the packages from explorer
Given Browser should be Launched and url is navigated 
When user is able to click on Holiday Packages link
And navigates to holiday packages page
And User should be on Holiday Package page
And user clicks on <Enter text> packages


Examples:
|Enter text|
|0 |
|1 |
|2 |
|3|
 


