package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US14_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("user navigate to Filters and click")
    public void user_navigate_to_and_click() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.filtersButton.click();

    }

    @Given("user navigate to Manage filters and click")
    public void user_navigate_to() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.manageFilters.click();

    }

    @Then("user should see all five options are checked by default")
    public void userShouldSeeAllFiveOptionsAreCheckedByDefault() {

        for (WebElement each : dashboardPage.manageList) {
            each.isSelected();


        }

        //each.findElement(By.id("ui-multiselect-7-7-option-0")).click();

    }
}
