$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/abrahamben/Desktop/FarhanTest2/Cucumber/com.CucumberDemo/src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Test login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing the right credentials for user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login_StepDefinition.user_should_be_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should write on the email filed the email and password",
  "keyword": "When "
});
formatter.match({
  "location": "login_StepDefinition.user_should_write_on_the_email_filed_the_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the user button",
  "keyword": "Then "
});
formatter.match({
  "location": "login_StepDefinition.user_should_click_the_user_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login successfully",
  "keyword": "And "
});
formatter.match({
  "location": "login_StepDefinition.user_should_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});