#Author: Jhonatan Paternina Rojas
Feature: As a saucedemo user I want to enter the website to buy products online


  Background:
    Given that the user is on the SauceDemo home page
      | name   | lastName   | postalCode   | mesaaage   | username   | password   |
      | <name> | <lastName> | <postalCode> | <mesaaage> | <username> | <password> |

  @shopping_flow
  Scenario Outline: Validate the purchase flow of products on the saucedemo page
    When the user authenticates with the username and the password
      | username   | password   |
      | <username> | <password> |
    And add two products to the shopping cart
    And view the contents of the shopping cart
    And complete the purchase form
      | name   | lastName   | postalCode   |
      | <name> | <lastName> | <postalCode> |
    Then can see the message Thank you for your order!

    Examples:
      | name     | lastName  | postalCode | username      | password     |
      | Jhonatan | Paternina | 21003      | standard_user | secret_sauce |

