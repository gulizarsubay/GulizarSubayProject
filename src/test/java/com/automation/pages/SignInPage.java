package com.automation.pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    public SignInPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']")
    public WebElement sign;


    public void setSignIn(String userNameStr, String passwordStr) {
        email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        sign.click();
        // verification that we logged
    }

    @FindBy(xpath = "//a[@title='View my customer account']")
    public WebElement getName;

    @FindBy(xpath = "(//div[@class='alert alert-danger'])[1]")
    public WebElement error;

}














