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
Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed

    
 Scenario: Login as an unauthenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user2 enters "HLTest" and "HLPWD"
    Then success message is not displayed
    
    
 Scenario Outline: Login as an admin user
    Given user is on homepage
    When user navigates to Login Page
    And user3 enters "<username>" and "<password>"
    Then success message is not displayed
Examples:
    | username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |