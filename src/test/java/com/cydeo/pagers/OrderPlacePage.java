package com.cydeo.pagers;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class OrderPlacePage {
    public OrderPlacePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Order']")
    public WebElement order;
    @FindBy(xpath = "//form//div//select")
    public WebElement productType;
    @FindBy(xpath = "//form//input[@name='quantity']")
    public WebElement quantity;
    @FindBy(xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement name;
    @FindBy(xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement street;
    @FindBy(xpath = "//input[@placeholder='City where the customer lives']")
    public WebElement city;
    @FindBy(xpath = "//input[@placeholder='State where the customer lives']")
    public WebElement state;
    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement creditCard;
    @FindBy(xpath = "//input[@placeholder='The number on the card']")
    public WebElement creditCardNumber;
    @FindBy(xpath = "//input[@placeholder='e.g. 04/24']")
    public WebElement expiryDate;
    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;
    @FindBy(xpath = "//tbody//td")
    public WebElement firstRow;



    
    
    
}
