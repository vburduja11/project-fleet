package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.CalendarActivitiesPage;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US09_StepDefs {

    CalendarActivitiesPage calendarActivitiesPage = new CalendarActivitiesPage();

    @Given("User should login into application as a {string}")
    public void user_should_login_into_application_as_a(String salesManager) {
        new LoginPage().login("Salesmanager101","UserUser123");
        //new LoginStepDefs().the_user_logged_in_with_username_as_and_password_as(salesManager,salesManager);
    }
    @When("user navigate to {string}")
    public void user_navigate_to(String menuOptions) {
        WebElement menuOption = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(menuOption).perform();
        calendarActivitiesPage.calendarEvents.click();

    }
    @When("user click on Create Calendar Event button")
    public void user_click_on_create_calendar_event_button() {
        calendarActivitiesPage.createCalendarEventBtn.click();
    }
    @Then("user click on the repeat checkbox")
    public void user_click_on_the_checkbox() {
        calendarActivitiesPage.repeatCheckBox.click();
    }

    @Then("user enter {string} to repeat every checkbox")
    public void userEnterToRepeatEveryCheckbox(String num) {
        num="0";
        calendarActivitiesPage.repeatEveryInputBox.sendKeys(Keys.ENTER + num);

    }

    @Then("user should get {string} message")
    public void user_should_get_message(String error) {
        String expectedError = "The value have not to be less than 1.";
        WebElement actualError = Driver.getDriver().findElement(By.xpath("//span[@class='validation-failed']//span[1]"));
        Assert.assertEquals(expectedError,actualError.getText());

    }



}
