
@login @skip
Feature: Login features

@login_01
Scenario: User log In into the system
Given user is on login page
When  user enters "myemail@email.com" and "password"
Then  user should be on homepage

