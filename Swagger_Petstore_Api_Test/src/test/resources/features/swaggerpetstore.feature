#Author: Jhonatan Paternina
Feature: As a petstore user I want to be able to create new users to enter the system

  Background:
    Given petStore service is available
      | username   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |


    @CreateUser
  Scenario Outline: Validate the creation of a new user
    When the user request to endpoint with params
      | username   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Then the user should receive a success response <statusCode>
    Examples:
      | username      | firstName | lastName  | email                   | password | phone      | userStatus | statusCode |
      | jhonatanpater | Jhonatan  | Paternina | jhonatanpater@gmail.com | abc123   | 3210000000 | 1          | 200        |

  @GetUserCreated
  Scenario Outline: Validate get user created by username
    When user searches for a user by name <username>
    Then the user should receive a success response <statusCode>
    And the response should contain the information of the created user
      | username   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Examples:
      | username      | firstName | lastName  | email                   | password | phone      | userStatus | statusCode |
      | jhonatanpater | Jhonatan  | Paternina | jhonatanpater@gmail.com | abc123   | 3210000000 | 1          | 200        |

@UpdateUser
  Scenario Outline: Update a user's name and email
    When the user updates the name and email
      | username   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    And validate that the name and email have been successfully edited
      | username   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Then the user should receive a success response <statusCode>
    Examples:
      | username      | firstName | lastName  | email             | password | phone      | userStatus | statusCode |
      | jhonatanpater | Test      | Paternina | test123@gmail.com | abc123   | 3210000000 | 1          | 200        |

@DeleteUser
  Scenario Outline: Delete an existing user
    When the user is deleted by name <username>
    Then the user should receive a success response <statusCode>
    Examples:
      | username      | statusCode |
      | jhonatanpater | 200        |


