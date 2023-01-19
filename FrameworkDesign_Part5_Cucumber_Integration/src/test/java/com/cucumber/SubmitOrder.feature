@tag
Feature: Order items in ecart page

Background: 
Given I landed on ecommerce page

@Regression
Scenario Outline: Positive test for submitting the order
Given Logged in with username <user_name> and password <pass_word>
When I add the product <product_name_1> to the cart
When I add the product <product_name_2> to the cart
And Checkout <product_name> and submit the order
Then "THANKYOU FOR THE ORDER." message is displayed

Examples:
|user_name|        				|pass_word|            |product_name_1|					 |product_name_2|
|Tapamth@gmail.com|				|Tapamth1!0|				   |IPHONE|                  |ZARA|
																			           