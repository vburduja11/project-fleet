package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarActivitiesPage extends BasePage {

    @FindBy (xpath = "//span[.=\"Calendar Events\"]")
    public WebElement calendarEvents;

    @FindBy(xpath = "//a[normalize-space()='Create Calendar event']")
    public WebElement createCalendarEventBtn;

    @FindBy(xpath = "//input[starts-with(@id,\"recurrence-repeat\")]")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//input[@name=\"temp-validation-name-1560\"]")
    public WebElement repeatEveryInputBox;


    @FindBy(xpath = "//span[@class='validation-failed']//span[1]")
    public WebElement errorMessage;


//"//span[.=\"Calendar Events\"]"
    //"//a[contains(@title,'Create Calendar event')]"

    //input[@class="recurrence-subview-control__number error"]
    //(//input[@value='1'])[2]
    //input[@name="temp-validation-name-1560"]

}
