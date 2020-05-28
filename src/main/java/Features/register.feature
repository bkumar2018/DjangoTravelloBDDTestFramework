Feature: Django Travello Register Users

Scenario: Django Travello Register a new user scenario

Given user is already on Home Page
When title of Home page is Travello
Then user click on register link
Then user is on Registration Page
Then user enters registrataion details
| ram  | singh	   | ram 	  | ram@abc.com    | 1234  	| 1234		|
Then user clicks on submit button
Then user moves to login page
Then register user login to page
| ram | 1234	   | 
Then user clicks on submit button of login page
Then close the browser



#Examples:
#| biru | singh	   | biru 	  | biru@abc.com    | 1234  	| 1234		|
#| abhi | singh	   | biru 	  | abhi@abc.com    | 1234  	| 1234		|
#| chan | singh	   | chan 	  | chan@abc.com    | 1234  	| 1234		|
#| ajan | singh	   | ajan 	  | ajan@abc.com    | 1234  	| 1234		|
#| ram  | singh	   | ram 	  | ram@abc.com    | 1234  	| 1234		|