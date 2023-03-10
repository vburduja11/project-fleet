package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage extends DashboardPage{

    public PinbarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='clearfix']/h3")
    public WebElement firstPinbarMessage;

    @FindBy(xpath = "//div[@class='clearfix']/p[1]")
    public WebElement secondPinbarMessage;

    @FindBy(xpath = "//div[@class='clearfix']//img")
    public  WebElement pinbarImage;



}
