package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US01_StepDefs {
    @Then("Store manager can see modules")
    public void store_manager_can_see_modules(List<String> menuOptions) {
        new DashboardPage().waitUntilLoaderScreenDisappear();

        List<String> actualOption= BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actualOption);
        System.out.println("actualOption = " + actualOption);
        System.out.println("menuOptions = " + menuOptions);

    }

    @Then("Driver can see modules")
    public void driver_can_see_modules(List<String> menuOptions) {

        new DashboardPage().waitUntilLoaderScreenDisappear();

        List<String> actualOption= BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals(menuOptions,actualOption);
        System.out.println("actualOption = " + actualOption);
        System.out.println("menuOptions = " + menuOptions);
    }
}
