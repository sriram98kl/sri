Feature: To create a lead


 @functional @smoke @regression @sri
Scenario: Createlead with informations

Given Enter username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed 
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should be displayed 