Feature: the new user registration
  Scenario: an unregistered user should be able to registered the site
    Given an unregistered user has opened the Registration page
    When an unregister user fills out the Registration form with the following details:
      | Field Name  | Value       |
      | First Name  | TestTest    |
      | Last Name   | TestTest    |
      | Password    | Q123456789  |
    Then the new customer TestTest should be registered the site