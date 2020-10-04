package com.automation.stepdefinitions;

import com.automation.pages.CreateAnAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationDefs {

    CreateAnAccountPage accountPage = new CreateAnAccountPage();

    @When("the user enters an email address")
    public void the_user_enter_a_email_address() {
        accountPage.newEmail.sendKeys("kenn@gmail.com");
    }

    @When("the user clicks Create an Account button")
    public void the_user_click_Create_an_Account_button() {
        accountPage.createAccount.click();

    }

    @Then("account creation page should be displayed")
    public void account_creation_page_should_be_displayed() {

        Assert.assertEquals(accountPage.pageHeading.getText(), "CREATE AN ACCOUNT");
    }

    @Then("the user enters valid information")
    public void the_user_enters_valid_information() throws InterruptedException {

        accountPage.firstName.sendKeys("Ken");
        accountPage.lastName.sendKeys("Riding");
        accountPage.firstPassword.sendKeys("1234545");
        accountPage.addressFirstname.sendKeys("Ken");
        accountPage.addressLastname.sendKeys("Riding");
        accountPage.address.sendKeys("3 Cara Close");
        accountPage.city.sendKeys("Los Angeles");

        Select stateList = new Select(accountPage.state);
        accountPage.state.click();
        stateList.selectByIndex(5);

        accountPage.postcode.sendKeys("45676");
        accountPage.mobilePhone.sendKeys("+13456739200");
        accountPage.register.click();

    }

    @Then("the user successfully should register and to see welcome message")
    public void the_user_successfully_should_register_and_to_see_welcome_message() {

        Assert.assertEquals(accountPage.welcomeMessage.getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");

    }


}
