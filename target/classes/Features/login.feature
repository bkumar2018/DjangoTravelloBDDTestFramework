Feature: Django Travello Login Feature


#With-out Examples keyword 
#Scenario: Django Travello Login Test Scenario
#Given user is present on login page
#When title of login page is Travello
#Then click on login link
#Then user enters "<username>" and "<password>"
#Then user click on submit button
#Then user is on home page
#Then user is logout 



#With Examples keyword for Data driven testing
Scenario Outline: Django Travello Login Test Scenario
Given user is present on login page
When title of login page is Travello
Then click on login link
Then user enters "<username>" and "<password>"
Then user click on submit button
Then user is on home page
Then user is logout 

Examples:
	| username | password|
	| admin	   | 1234	 |
	| shweta   | 1234    |