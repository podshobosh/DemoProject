Feature: Home Page Navigation
  User Story: As a user, I want to be able to access website features with either signing in immediately,
  skipping the sign in process or creating an account
  so that I can explore the content and have access to all the functionalities of this website

  Scenario: User can chose to sin-in, skip sign in, or enter email for sign up

    Given user is on the webpage
    When user interacts with the sign-in options
    Then the user should be directed accordingly

    Examples:
      | Options      | Expected Destination |
      | Sign in      | Sign in Page         |
      | Skip Sign-In | Register Page        |
      | Enter Email  | Register Page        |


