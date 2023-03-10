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
import java.util.SortedSet;

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

        List<WebElement> allCheckedBoxes = dashboardPage.filterNames;
        Assert.assertTrue(BrowserUtils.allSelected(allCheckedBoxes));
        System.out.println("All checkboxes selected by default");
    }

    @Then("Verify one or more options can be unchecked")
    public void verifyOneOrMoreOptionsCanBeUnchecked() {
        List<WebElement> allCheckboxes = dashboardPage.filterNames;
        for (int i = 0; i < allCheckboxes.size(); i++) {
            if (allCheckboxes.get(i).isDisplayed() && allCheckboxes.get(i).isEnabled()) {
                allCheckboxes.get(i).click();
                BrowserUtils.sleep(1);
            }
            if (!allCheckboxes.get(i).isSelected()) {
                System.out.println("All checkboxes deselected successfully");
            }

        }
        Assert.assertTrue(BrowserUtils.unselected(allCheckboxes));

    }

}
