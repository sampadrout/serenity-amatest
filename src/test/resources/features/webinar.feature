@regression
Feature: A registered user can add webinars
  As a registered user
  I want to login to AMA app using my username and password
  So that i can manage my webinars

  Scenario: Registered user can add webinars
    Given user logs in using username, password and phone number
      | username 			  | password    |	phonenumber	|
      | traqatest5@gmail.com  | welcometr1  |	9546532543	|
    When navigates to settings
    And user taps on joining options setting
    And user should see the joining options setting screen
    And user taps on webinars setting
    And user should see the webinars setting screen
    And user taps on add webinar button
    And user enters webinar name
    And user enters webinar url
    And user taps on save
    Then user successfully added the webinar