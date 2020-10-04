$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/signin.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SigninDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click to sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "SigninDefs.the_user_click_to_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user logs in with valid information \"username\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "SigninDefs.the_user_logs_in_with_valid_information(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user login the account successfully and see his name",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninDefs.the_user_login_the_account_successfully_and_see_his_name()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SigninDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click to sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "SigninDefs.the_user_click_to_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should not able to login with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user logs in with invalid information \"username\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "SigninDefs.the_user_logs_in_with_invalid_information(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninDefs.the_user_should_see_an_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});