package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage extends BasePage{

    @FindBy(id = "email_create")
    public WebElement newEmail;

    @FindBy(xpath = "//i[@class='icon-user left']")
    public WebElement createAccount;

    @FindBy(xpath = "//h1[text()='Create an account']")
    public WebElement pageHeading;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement firstPassword;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement addressFirstname;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement addressLastname;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//select[@name='id_state']")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(xpath = "//select[@name='id_country']")
    public WebElement country;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone;

    @FindBy(id="submitAccount")
    public WebElement register;

    @FindBy(xpath = "//p[@class='info-account']")
    public WebElement welcomeMessage;

}
