Feature: Application login

Scenario Outline: Home Page default login

Given User is on Net Baanking Page
When User logs into the application with <username> and <password>
Then Home Page is displayed
And Cards displayed are "true"

Examples:

|username	|password	|
|jin@gmail.com		|jax		|
|pin@gmail.com		|pax		|