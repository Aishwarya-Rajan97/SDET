Feature: Elearning skills

  Scenario Outline: Register functionality
    Given User is on the main page
    When User gives all mandatory fields "<FirstName>","<SecondName>","<Email>","<UserName>","<Password>"
    And click the next button
    Then The next page with the message has to be dispalyed
    When User clicks on the dropdown menu and verify email
    When User clicks on maincourse and compose mail
    Then The success message is captured
    Then Click on logout

    Examples: 
      | FirstName | SecondName | Email                      | UserName            | Password   | Send_to     | Body                 |
      | Aishwarya | Rajan      | rajanaishwarya97@gmail.com | Rajan_aishwarya70123 | Helloworld |  Virat Kohli | Hi This is Aishwarya |



   
