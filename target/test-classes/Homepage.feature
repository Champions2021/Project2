Feature: Homepage Functionality

  As a user
  I want to go on outnet website
  So that I can buy a products

  @Register
  Scenario: user able to register
    Given user is on the outnet homepage
    When user click on sign in button
    And user enter email address
    And click on I'm new to outlet radio button
    And user enter the password
    And user enter the First name and Last name
    And user click on "NoThanks" promotional eamil radio button
    And user click on register
    Then user shoul be able to register

  @Superbrands
  Scenario: user able to click on any superbrand
    Given user is on the outnet homepage
    When user click on any superbrand
    Then user able to see the respective products of that superbrand


