Feature: Homepage login

Scenario: Click on signin button
Given user is on loginpage
When user hover in signin button
Then click on signin button
Then enter the email address
Then clickon continue
Then enter the password
And click on signin button in signinpage
Then verify the user invitation "Hello, Rajan"

Scenario: Verify the order placed
Given user is on loginpage
#When user hover in signin button
#Then click on "Your order"
#Then select the year "2020"
