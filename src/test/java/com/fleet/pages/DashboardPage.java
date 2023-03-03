package com.fleet.pages;

import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{

public DashboardPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//div[@class='message']")
    public WebElement flashMessage;


}
