package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage extends BasePage {

    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetDropdown;

    @FindBy (xpath = "//*[text()='Vehicle Odometer']")
    public WebElement vehicleOdometerButton;

    @FindBy (xpath = "//*[text()='You do not have permission to perform this action.']")
    public WebElement errorMessage;

    @FindBy (xpath = "//input[@value='1']")
    public WebElement defaultPage;

    @FindBy(xpath = "//button[normalize-space()='25']")
    public WebElement viewPerPage;


}
