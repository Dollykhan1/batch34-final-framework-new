@Smoke @Regression 
Feature: Login function test 
	descripion:

@Positive @TC_LP_18 
Scenario: Check login with valid credentials 
	Given Open browser and go to application 
	When put valid user name 
	When put valid password value 
	When cleck login button 
	Then logout button should there 
	
@Nagative @TC_LP_19 
Scenario: Check login with valid credentials 
	Given Open browser and go to application 
	When put invalid user name 
	When put invalid password value 
	When cleck login button 
	Then alart msg showed invalid username or pasword 
	
@Nagative @TC_LP_20 
Scenario: Check login with null credentials 
	Given Open browser and go to application 
	When put null user 
	When put null password 
	When cleck login button 
	Then alart msg showed invalid username or pasword 
	
	
