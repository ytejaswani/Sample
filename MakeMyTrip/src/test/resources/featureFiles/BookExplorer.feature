Feature: click BookExplorer

Scenario Outline: Validate user is able to select package location from BookExplorer
Given Browser should be Launched and url is navigated 
When user is able to click on Holiday Packages link
And navigates to holiday packages page
And User should be on Holiday Package page
And User should click on BookLink
And user clicks on <click text> inside BookMenu


Examples:
|click text|
|0 |
|1 |
|2 |
 


