package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US4_StepDefs {
    @Given("the user click the vehicle contracts under the fleet")
    public void the_user_click_the_vehicle_contracts_under_the_fleet() {
        new DashboardPage().waitUntilLoaderScreenDisappear();
        new DashboardPage().navigateToModule("Fleet","Vehicle Contracts");

    }


    @Then("user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String expected) {
        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertTrue(expected,dashboardPage.flashMessage.isDisplayed());


    }
}
