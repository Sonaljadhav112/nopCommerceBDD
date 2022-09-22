Feature: Login 

Scenario Outline: Login with  credentials 

Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And User enters Email as "<id>" and Password as "<pw>"
And Click on Login button
Then Page title should be "Dashboard / nopCommerce administration"
And close browser

Examples:
|id|pw|
|admin@yourstore.com|admin|
|admin@you|admin|