Feature: Free CRM Login Feature

# Data driven approach without Examples keyword

#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on Login button
#Then user is on Homepage


# Data driven approach with Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on Homepage
Then close the browser

Examples:
| username | password |
| naveenk  |test@123|
| tom      | test456  |

