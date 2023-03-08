package com.fleet.step_definitions;

import com.fleet.pages.CalendarEventsPageMR;
import com.fleet.pages.DashboardPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US8_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    CalendarEventsPageMR calendarEventsPageMR = new CalendarEventsPageMR();


    @Given("the user are on the homepage")
    public void the_user_are_on_the_homepage() {
        dashboardPage.waitUntilLoaderScreenDisappear();

    }

    @Then("click the {string} under the {string}")
    public void click_the_under_the(String tab, String module) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.navigateToModule(tab, module);
    }

    @Then("click the {string} button")
    public void click_the_button(String createCalendarEvent) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        calendarEventsPageMR.createCalendarEvent.click();
    }

    @Then("check the Repeat checkbox")
    public void check_the_repeat_checkbox() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        calendarEventsPageMR.checkbox.click();
    }

    @Then("verify the repeat number is {int}")
    public void verify_the_repeat_number_is(Integer int1) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        String act = calendarEventsPageMR.repeatEveryInputBox.getText();
        String exp = "";
        Assert.assertEquals(act, exp);
    }


    @Then("verify the app displays {string}")
    public void verifyTheAppDisplays(String days) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        calendarEventsPageMR.errorMessage.isDisplayed();
    }

    @Then("the user clear\\(delete) the number {int}")
    public void theUserClearDeleteTheNumber(int arg0) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        calendarEventsPageMR.repeatEveryInputBox.clear();
        Assert.assertTrue(calendarEventsPageMR.errorMessage.isDisplayed());

    }
}
