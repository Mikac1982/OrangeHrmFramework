#Author: syntax team   //john.smith@wellsfargo.com
Feature: Add Location

Scenario Outline: Add Location 

 Given I navigated to OrangeHrm
 And I see OrangeHrm logo
 And I logged in into OrangeHrm
 When I click on Admin link
 And I click on Organization link
 And I click on Locations link
 And I click on add button
 And I provide location details "<name>" and "<country>" and "<city>" and "<zip>"  
 And I click on save button two
 Then I see location  "<country>" is successfully added
 And I close browser

 Examples:
 
 |  name  |       country         |   city   |  zip  |
 | Luis   | Spain                 | Madrid   | 28001 |
 | Helena | Greece                | Atina    | 3042  |
 | Monica | Italy                 | Milan    | 61201 |
 | Milena | Serbia and Montenegro | Beograd  | 11000 |
