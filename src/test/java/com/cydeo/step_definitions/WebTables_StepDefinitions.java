package com.cydeo.step_definitions;

import com.cydeo.pagers.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTables_StepDefinitions {
    WebTablePage webTablePage = new WebTablePage();

    @Given("user is on the login pageof web table app")
    public void user_is_on_the_login_pageof_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableURL"));
    }

    @When("user enters username: {string}")
    public void user_enters_username(String string) {
        webTablePage.username.sendKeys(string);
    }

    @When("user enters password: {string}")
    public void user_enters_password(String string) {
        webTablePage.password.sendKeys(string);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        webTablePage.loginButton.click();
    }

    @Then("user should see url ends with orders")
    public void user_should_see_url_ends_with_orders() {

        BrowserUtils.verifyURLEndsWith("orders");
    }

    @When("user enters username: {string} password: {string} and logins")
    public void user_enters_username_password_and_logins(String username, String pw) {
        webTablePage.login(username,pw);
    }
    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> map) {
        webTablePage.login(map.get("username"),map.get("password"));
    }
}
