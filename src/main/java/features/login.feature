#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login page test of CRM

@tag1 
Scenario Outline: Login with wrong username and password
	Given User is on login page
	And verify the login page title
	When User enter wrong "<username>" and "<password>"
	Then Error message is displayed
	
	Examples:
	
	| username | password |
	| meet | dbvjjdvn |
	|      | dksjvkdjf |
	| jay |        |
	
@tag2
Scenario: Login with correct username and password
	Given user is on the login page
	And verify login title
	When enter email and password
	Then verify that user is on homepage


