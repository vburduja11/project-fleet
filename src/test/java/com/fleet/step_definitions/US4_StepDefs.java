package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US4_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    @And("the user navigate to {string} - {string}")
    public void theUserNavigateTo(String tab, String module) {

        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.navigateToModule(tab,module);
    }


    @Then("the title contains {string}")
    public void theTitleContains(String expectedTitle) {
        dashboardPage.waitUntilLoaderScreenDisappear();
      Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

    }


    @Then("user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String expected) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(expected,dashboardPage.flashMessage.isDisplayed());


    }


    @Then("the page url is {string}")
    public void thePageUrlIs(String expectedUrl) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));
    }
}
