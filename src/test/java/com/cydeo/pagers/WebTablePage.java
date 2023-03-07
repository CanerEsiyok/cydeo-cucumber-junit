package com.cydeo.pagers;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
    public WebTablePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//form//input[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//form//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button")
    public WebElement loginButton;


    public void login(){
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.loginButton.click();
    }
    public void login(String usrname,String pw){
        username.sendKeys(usrname);
        password.sendKeys(pw);
        loginButton.click();
    }

    public void loginWithConfig(){
        username.sendKeys(ConfigurationReader.getProperty("webTable.username"));
        password.sendKeys(ConfigurationReader.getProperty("webTable.pw"));
    }
}
