Feature: OrangeHrmLogin

Scenario: Login with valid credentials

Given I navigate to orangehrm page
When I enter valid username and valid password
And I click on login button
Then I can see home page

Scenario: :Login with invalid credentials

Given I navigated to orangehrm page
When I entered valid username and invalid password
And I clicked on login button
Then I see error message is displayed