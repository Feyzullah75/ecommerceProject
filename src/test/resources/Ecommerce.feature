Feature:Ecommerce Practice

  Background:  The user can navigate to the page
    Given The user navigate to automation practice website

  Scenario: Creating new account
    When The user click sign in button
    Then The user provide valid email "<address>"
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



