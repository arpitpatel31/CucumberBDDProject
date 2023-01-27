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
Feature: Home Page Test of CRM

Scenario Outline: Creating new contacts in CRM
 Given User is on homepage
 And verify the userlabel and triallabel
 When User mouse hover to contacts
 And verify new contacts page is open
 Then user add new contact "<firstname>", "<lastname>", "<position>" and "<department>"
 
 Examples: 
 	| firstname | lastname | position | depatment |
 	| meet | shah | Jr. developer | Development |
 	| jay | joshi | Automation Tester | Testing |
 	| arpit | thakkar | Lead Automation | Testing |
 	| rushil | patel | Develpoer | Development |
