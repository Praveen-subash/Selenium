Feature: Application login

Scenario: Home Page default login

Given User is on Net Baanking Page
When User logs into the application with Username and password
Then Home Page is displayed
And Cards are displayed