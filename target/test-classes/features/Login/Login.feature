@Ignore
Feature: Validating login with valid and invalid cred

  @Login @Sanity
  Scenario Outline: User validate login with diffrent UserID and PassWord
    Given User enters "<UserName>" and "<PassWord>"
    When user call "LoginApi" with "POST"  http request
    And user validate API call got success with status code "<StatusCode>"
    Then user validate "result.Message" the "<message>" from the response

    Examples: 
      | UserName            | PassWord                       | StatusCode | message                                                   |
      | John_Doe-testuser23 | demo123333                     |        200 | Invalid Username or Password. Please check and try again. |
      | John_Doe-testuser2  | Demopassword@#$%*!_-&+12345678 |        200 | Data                                                      |
      | John_Doe-testuser2  | Demo@123                       |        200 | Data                                                      |
      | auto16391           |                                |        200 | Data                                                      |
      |                     |                                |        200 |                                                           |
      |                     | Demo@123                       |        200 |                                                           |
