package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressPage extends BasePage {

    @FindBy(partialLinkText = "Evening Dress")
    public WebElement eveningDress;

    @FindBy(xpath = "//input[@id='layered_id_attribute_group_1']")
    public WebElement sizeS;

    @FindBy(xpath = "//img[@title='Printed Dress']")
    public WebElement printedDress;

    @FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']")
    public WebElement addChart;


    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement checkout;





}
