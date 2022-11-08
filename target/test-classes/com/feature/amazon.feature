Feature: Adactin Hotel Booking Application
//@test1
//Scenario: Login Functionality
//Given user Launch The Adactin Application
//When user Enters The "sridhar0231" Username In The InputBox
//And user Enters The "sridhar123" Password In The InputBox
//Then user Clicks On The LoginBtn And It Navigate To The SearchPage

@test1
Scenario Outline: Login Functionality
Given user Launch The Adactin Application
When user Enters The "<username>" Username In The InputBox
And user Enters The "<password>" Password In The InputBox
Then user Clicks On The LoginBtn And It Navigate To The SearchPage

Examples:
|username|password|
|sridhar456|12345|
|arun123|15675|
|dharani1235|124556|

Scenario:  Search Functionality
When user Selects The Location On The Dropdown 
And user Selects The Hotel From The Dropdown
And user Selects The Roomtype From The Dropdown
Then user Clicks On The SearchBtn And It Navigates To The SelectHotel Page