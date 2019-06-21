#Author: syntax team   //john.smith@wellsfargo.com
Feature: Add Employee

  Scenario Outline: AddEmployee
    Given I navigated to OrangeHrm
    And I see OrangeHrm logo
    And I logged in into OrangeHrm
    When I click on PIM link
    And I click on AddEmployee link
    And I provide employee details "<fName>" and "<mName>" and "<lName>" and "<id>" and "<location>" 
    And I click on save button
    Then I see employee is "<fName>" and "<lName>" is added successfully
    And I close browser

    Examples: 
      | fName | mName | lName | id   | location |
      | Jacky | S     | Adams | 2461 | Ben      |
      | Mike  | K     | Spirs | 1571 | Dani     |
      | Anna  | M     | Alba  | 1311 | Jorgos   |
