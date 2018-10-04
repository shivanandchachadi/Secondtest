Feature: somke test
Scenario Outline: test with valid credentials
 Given AUT ,open login page
 When i enter valid "<username>" and Valid "<Password>" 
 Then login should be successful with message as "<title>"
## Then give status whether passed or fail "<status">
 Examples:
 |username  | Password|title|
 |shivanand.chachadi||Travel Requests|
 
 Scenario Outline: test with invalid credentials
 Given AUT ,open login page
 When i enter valid "<username>" and Valid "<Password>" 
 Then login should be unsuccessful with message as "<title>"
 Examples:
 
 |username |Password|title|
 |mukesh|pass123|The user name or password provided is incorrect.|