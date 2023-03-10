package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPageMR extends BasePage {

    public CalendarEventsPageMR(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement checkbox;


    @FindBy(xpath = "(//input[@value='1'])[2]")
    public WebElement repeatEveryInputBox;

    @FindBy(xpath = "//span[@class='validation-failed']//span[1]")
    public WebElement errorMessage;

    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement description;

    @FindBy(xpath = "//p")
    public WebElement descriptionTextForVerify;

}
