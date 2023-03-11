package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage extends BasePage {

    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//i[@class='fa-asterisk menu-icon']")
    public WebElement fleetDropdown;

    @FindBy (xpath = "//*[text()='Vehicle Odometer']")
    public WebElement vehicleOdometerButton;

    @FindBy (xpath = "//*[text()='You do not have permission to perform this action.']")
    public WebElement errorMessage;



}
