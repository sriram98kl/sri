Feature:  Perform deletelead


Scenario: Delete the Exixting lead

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
When Click on the first coming  lead id
Then 'View Lead' should be display
When Click on the 'Delete'
Then 'My Leads' should be display
When Click on the 'Find Leads'
Given Enter the leadid as leadID
When click the button
Then check the deleted lead exist or not 