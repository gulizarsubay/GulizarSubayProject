package com.automation.pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public abstract class  BasePage {

        public BasePage() {
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
        public WebElement search;

        @FindBy(xpath = "//button[@name='submit_search']")
        public WebElement searchClick;

        @FindBy(xpath = "//a[@class='login']")
        public WebElement signIn;

        @FindBy(xpath = "//span[@class='ajax_cart_no_product']")
        public WebElement cart;

        @FindBy(xpath = "//a[@title='Women']")
        public WebElement women;

        @FindBy(xpath = "(//a[@title='Dresses'])[2]")
        public WebElement dresses;

        @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
        public WebElement tShirts;




}
