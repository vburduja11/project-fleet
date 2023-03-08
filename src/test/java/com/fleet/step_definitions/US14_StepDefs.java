package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.utilities.BrowserUtils;
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

        for (int i = 0; i <=4; i++) {
            String element = "//input[@id='ui-multiselect-0-0-option-"+i+"']";
            WebElement filterCheckBox = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertTrue(filterCheckBox.isSelected());
            System.out.println("filterCheckBox.isSelected()"+i+" = " + filterCheckBox.isSelected());

        }

    }


    @Then("Verify one or more options can be unchecked")
    public void verifyOneOrMoreOptionsCanBeUnchecked() {

        for (int i = 0; i <=4; i++) {
            BrowserUtils.sleep(0);
            String element = "//input[@id='ui-multiselect-0-0-option-"+i+"']";
            WebElement filterCheckBox = Driver.getDriver().findElement(By.xpath(element));
            filterCheckBox.click();
        }

    }
}
