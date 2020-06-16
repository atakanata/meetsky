@login
  Feature: login


  Background: open login page
    Given user is on the login page

  @user_login
  Scenario: Login with parameters
    When user enters "User269" username and "Userpass123" password
    Then user should verify that title is "Files - Trycloud"

  @navigateTo
  Scenario Outline: Navigate to "<module>"
    When user enters "User269" username and "Userpass123" password
    Then user should be able to navigate to "<module>"
    Then user should very that title is "<webTitle>"

    Examples: modules
    |module|webTitle|
    |files |Files - Trycloud|
    |activity|Activity - Trycloud|
    |gallery |Gallery - Trycloud |
    |spreed  |Talk - Trycloud  |
    |calendar|Calendar - Trycloud   |
    |deck    |Deck - Trycloud       |
    |announcementcenter|Announcements - Trycloud|