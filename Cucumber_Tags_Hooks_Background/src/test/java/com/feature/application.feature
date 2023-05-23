Feature: Application Login Testing
		
		
		
		Background: We are Testing the background here
		Given This is a background  
		
		@Smoke @Important
  	Scenario: Home Page Login Testing
    Given User is on NetBanking Landing Page
    When User logs into old application with username and password
    Then Home Page is populated
    And Cards are displayed with message "SUCCESS"

    
    Scenario Outline: Home Page Login Testing using parameters
    Given User is on NetBanking Landing Page
    When User logs into application with <Username> and <Password>
    Then Home Page is populated
    And Cards are displayed with message "SUCCESS"
    
    Examples:
    |Username|					|Password|
    |ABC|								|123|
    |DEF|								|456|