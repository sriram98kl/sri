Feature: Perform duplicate


Scenario: create a dup
Given Open the chromebrowser
And Open the url
And Login with username as 'DemoSalesManager'
And Login with password as 'crmsfa'
When Click on the login
Then homepage should be display
When Click on the 'CRM/SFA'
Then 'My Home' should be display
When Click on the 'Leads'
Then 'My Leads' should be display
When Click on the 'Find Leads'
Then 'Find Leads' should be display
When Click on phone
Given Enter the phone.no
When Click on the findleads
Then leadlist  should be display
When Click on the first lead id
Then 'View Lead' should be display
When Click on the 'Duplicate Lead'
Then 'Duplicate Lead' should be display
When Click on the submit
Then 'View Lead' should be display