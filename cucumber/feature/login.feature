Feature: Login functionality of leaftap application

#Background:
#Given Open the chrome browser
#And Load the application url

@functional @smoke
Scenario Outline: Login with positive credential


Given Enter username as <username>
And Enter the password as <password>
When Click on login button 
Then Homepage should be displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional @regression
Scenario: Login with negative credential

Given Enter username as 'Demo'
And Enter the password as 'crmsfa'
When Click on login button 
But Error msg should displayed

