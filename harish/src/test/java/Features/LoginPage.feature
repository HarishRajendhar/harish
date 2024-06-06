Feature: Login Check

Scenario: Positive test validating login
Given Initialize the browser with chrome
When Navigate to home page
And User enters Username and Password and logs in
Then Verify that user is succesfully logged in
