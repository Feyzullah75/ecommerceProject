Feature: Automation practice login functionality


  Scenario: Automation practice login positive testing
    Given The user navigate to the automation practice page
    When The user provide the valid Email address
    And The user provide the valid password
    Then The user should see home page

  Scenario: Automation practice login negative testing
    Given The user navigate to the automation practice page
    When the user provide Email address "sassdfdfffgf"
    And the user provide password "admin"
    Then the user validate text "Invalid Login or Password"