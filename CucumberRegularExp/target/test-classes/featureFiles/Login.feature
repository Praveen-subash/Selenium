Feature: Application login

Scenario: Home Page default login

Given User is on Net Baanking Page
When User logs into the application with "jin" and "jax"
Then Home Page is displayed
And Cards displayed are "true"


Given User is on Net Baanking Page
When User logs into the application with "abin" and "abax"
Then Home Page is displayed
And Cards displayed are "false"