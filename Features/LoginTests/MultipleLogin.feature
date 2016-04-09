@login @wip
Feature: Multiple Login Feature

@skip
Scenario Outline: Mutiple Login
*     user is on login page
*     user enters "<username>" with "<password>"
*     user should be on homepage

Examples: sampple usernames and password
|username    |password    |
| capyteacher1| GotWic|
| inportia_batch01@yopmail.com| 123456|


@login_02
Scenario: Print all the usernames
* print all the usernames and passowrd
  |username    |password|
  |capytecher1|GotWIc|
  |email_1|password_1|
  |email_2|password_2|
