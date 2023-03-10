package com.fleet.step_definitions;

import com.fleet.pages.CalendarEventsPageMR;
import com.fleet.pages.DashboardPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US10_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    CalendarEventsPageMR calendarEventsPageMR = new CalendarEventsPageMR();

    @Then("write a message in the Description field")
    public void write_a_message_in_the_description_field() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        Driver.getDriver().switchTo().frame(0);
        calendarEventsPageMR.description.sendKeys("Hello my name is Mike");

    }

    @Then("verify the message is written in the input box")
    public void verify_the_message_is_written_in_the_input_box() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        String act = calendarEventsPageMR.descriptionTextForVerify.getText();
        String exp = calendarEventsPageMR.description.getText();
        Assert.assertEquals(act,exp);
    }

}
