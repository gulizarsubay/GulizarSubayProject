package com.automation.stepdefinitions;

import com.automation.pages.SignInPage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SigninDefs {

    SignInPage signInPage = new SignInPage();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @Given("the user click to sign in button")
    public void the_user_click_to_sign_in_button() {

        signInPage.signIn.click();

    }

    @When("the user logs in with valid information {string} {string}")
    public void the_user_logs_in_with_valid_information(String string, String string2) throws InterruptedException {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        signInPage.setSignIn(username,password);

    }

    @Then("the user login the account successfully and see his name")
    public void the_user_login_the_account_successfully_and_see_his_name() {

        Assert.assertEquals(signInPage.getName.getText(),"Gulizar Subay");

    }

    @When("the user logs in with invalid information {string} {string}")
    public void the_user_logs_in_with_invalid_information(String string, String string2) throws InterruptedException {
        signInPage.email.sendKeys("gul@hotmail.com");
        signInPage.password.sendKeys("1234");
        signInPage.sign.click();

    }

    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {

        Assert.assertTrue(signInPage.error.getText().contains("There is 1 error"));

    }

}
