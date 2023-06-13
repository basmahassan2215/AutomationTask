Feature: Sign in with invalid username with arabic version
  Ender invalid username while the user logging in and expect to get error message with Arabic language


  Scenario Outline: Sign in with invalid Username

    Given  The user navigate to STC.tv homepage
    When    The User click on Translation button
    And     The User Click to Sign-in Button
    And     The User enter Invalid UserName "<UserName>"
    Then    The User validate that there is error message shall be displayed

    Examples:
      | UserName |
      |  test      |
