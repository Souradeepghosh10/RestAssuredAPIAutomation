@Ignore
Feature: Validating Login Api with UserID

  @Login @Sanity
  Scenario Outline: User validate user with userName and Password
    Given User enters Valid LoginID "<UserName>" and "<PassWord>" and get the get the Login Token
    

    Examples: 
      |UserName| PassWord|
      |Nikhil102|Demo@1234|