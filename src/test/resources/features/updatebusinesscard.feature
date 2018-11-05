@regression
Feature: A registered user can update business card
  As a registered user
  I want to login to AMA app using my username and password
  So that i can update my business card

  Scenario: Registered user can update business card
    Given user signs in using username, password and phone number
      | username 			  | password    |	phonenumber	|
      | traqatest5@gmail.com  | welcometr1  |	9546532543	|
    When user navigates to settings
    And taps on my account
    And user is on my account screen
    And user taps on business card setting
    And user is on business card screen
    And user updates the first name
    And user taps to save updated first name
    Then user successfully updated the business card information