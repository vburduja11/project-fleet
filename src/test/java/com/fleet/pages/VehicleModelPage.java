package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleModelPage {

    public VehicleModelPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*/div[2]/div[2]/div[2]/div/table/thead[1]/tr/th/a/span[1]")
    public List<WebElement> columnOptions;

}
