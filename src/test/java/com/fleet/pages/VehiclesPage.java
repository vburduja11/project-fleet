package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage extends BasePage {

    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//thead[@class='grid-header']//input[@type='checkbox']")
    public WebElement allVehiclesCheckbox;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> vehicleCheckbox;



}
