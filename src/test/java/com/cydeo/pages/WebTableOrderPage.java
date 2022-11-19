package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage{

    public WebTableOrderPage(){
        // int question? how do you create page classes?
        PageFactory.initElements(Driver.getDriver(),this);
        // explanation: I am creating constructor
        // What do you pass in constructor?
        //explanation: PageFactory class,I am using InitElements method to pass my driver
        // "this" keyword for the objects all elements
    }

    // BasePage is basically your parent page whichever you go, you will keep seeing this basPAge
    // I have BasePAge class which is parent of all of my classes and I am using extend keywords to use the basePAge
    //What do you pass this basePage class?
    // Headers and Footers of my application. I put the element basePage class

    @FindBy(name = "product")
    public WebElement productTypeDropdown;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;

    @FindBy(name = "state")
    public WebElement inputState;

    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(name = "cardNo")
    public WebElement inputCardNo;

    @FindBy(name = "cardExp")
    public WebElement inputCardExp;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

}
