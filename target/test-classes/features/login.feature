Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site
And Click on Login link in home page to land on Sign in page
When User enters <username> and <password> and logs in
Then Verified that user is successfully logged in
And close browsers

Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test123@gmail.com	|12345		|

