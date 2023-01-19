@tag
Feature: Error validation in submit order
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Validation of errors in home page
    Given I landed on ecommerce page
    When Logged in with username <user_name> and password <pass_word>
    Then "Incorrect email or password." is displayed

Examples:    
|user_name|        				|pass_word| 
|Tapamth@gmail.com|				|Tapamth2!0|
    

  