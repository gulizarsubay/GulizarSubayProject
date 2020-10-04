package com.automation.stepdefinitions;

import com.automation.pages.DashboardPage;
import com.automation.pages.DressPage;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class AddingItemDefs {

    DashboardPage dashboardPage = new DashboardPage();
    DressPage dressPage = new DressPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.get();
    Actions action = new Actions(Driver.get());

    @When("the user selects dresses")
    public void the_user_selects_dresses() {
        dashboardPage.dresses.click();
    }

    @When("the user selects evening dresses")
    public void the_user_selects_evening_dresses() {
        dressPage.eveningDress.click();

    }

    @When("the user selects first item")
    public void the_user_selects_first_item() {
        js.executeScript("arguments[0].scrollIntoView();", dressPage.printedDress);
        action.moveToElement(dressPage.printedDress).build().perform();


    }

    @Then("Item should get added to the cart")
    public void item_should_get_added_to_the_cart() throws InterruptedException {

        action.moveToElement(dressPage.addChart).click().perform();

    }

    @Then("the user able to click to proceed to checkout")
    public void the_user_able_to_click_to_proceed_to_checkout() throws InterruptedException {

        //Handle to pop up
        String MainWindow = Driver.get().getWindowHandle();

        // To handle a new opened window.
        Set<String> s1 = Driver.get().getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window and click Proceed to checkout

                Driver.get().switchTo().window(ChildWindow).findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
            }
        }
    }


}
