Feature:Ecommerce Practice

  Background:  The user can navigate to the page
    Given The user navigate to automation practice website

#  @smoke @TC-1
  Scenario: Creating new account
    When The user click sign in button
    Then The user provide valid email
    And The user click create an account button
    Then The user validate your personal info
      | FirstName   | Feyzullah     |
      | LastName    | Abdyvaidov    |
      | Password    | Test123       |
      | DateOfBirth | 02/10/2000    |
      | Company     | GBME          |
      | Address     | 2200 E Devon  |
      | City        | Des Plaines   |
      | State       | Illinois      |
      | Zip         | 60016         |
      | Country     | United States |
      | HomePhone   | 3223334444    |
    * The user click register button

#  @TC-2 @TC
  Scenario: Sign in with valid credentials
    When the user click sign out button
    Then the user provide valid credentials
    Then the user validate his name popped up

#  @TC-3 @TC
  Scenario: Sign in with invalid credentials
    When the user click sign out button
    Then the user provide invalid credentials
    * the user validate error message "There is 1 error"







