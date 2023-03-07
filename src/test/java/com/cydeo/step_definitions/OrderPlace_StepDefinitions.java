package com.cydeo.step_definitions;

import com.cydeo.pagers.OrderPlacePage;
import com.cydeo.pagers.WebTablePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class OrderPlace_StepDefinitions {
    OrderPlacePage orderPlacePage=new OrderPlacePage();
    WebTablePage webTablePage=new WebTablePage();
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableURL"));
        webTablePage.login();
        orderPlacePage.order.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select=new Select(orderPlacePage.productType);
        select.selectByVisibleText(string);

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        orderPlacePage.quantity.clear();
        orderPlacePage.quantity.sendKeys(int1.toString());
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPlacePage.name.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPlacePage.street.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPlacePage.city.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPlacePage.state.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
    orderPlacePage.zipCode.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
        Driver.getDriver().findElement(By.xpath("//input[@value='"+string+"']")).click();
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPlacePage.creditCardNumber.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPlacePage.expiryDate.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPlacePage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

        Assert.assertTrue(orderPlacePage.firstRow.getText().equals(string));
    }
}
