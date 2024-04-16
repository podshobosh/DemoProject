@register
Feature: User should be able register and create and account
  User Story: As a user I want to register and create a new account by providing all the necessary information

  Background: user is on the register page

    Scenario: user is registering and creating a new account
      Given user enters all the required information for registration
      When user clicks submit
      Then user should have a account