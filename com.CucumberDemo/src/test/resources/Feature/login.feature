Feature: Test login page

@login @smoke
Scenario: Testing the right credentials for user

Given User should be on the login page 
When user should write on the email filed the email and password 
Then user should click the user button 
And user should login successfully 
