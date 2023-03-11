package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.VehicleOdometerPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefs {


        LoginPage loginPage = new LoginPage();

        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();

        Actions actions = new Actions(Driver.getDriver());


    @When("user signs in as Store manager")
    public void user_signs_in_as_store_manager() {

        loginPage.userName.sendKeys("Storemanager70");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

    }
    @Then("user navigates to {string} module")
    public void user_navigates_to_module(String string) {

        actions.moveToElement(vehicleOdometerPage.fleetDropdown).perform();





    }
    @Then("user sees a “You do not have permission to perform this action.” error message")
    public void user_sees_a_you_do_not_have_permission_to_perform_this_action_error_message() {


        vehicleOdometerPage.vehicleOdometerButton.click();
        vehicleOdometerPage.errorMessage.isDisplayed();



    }

    @When("user signs in as Sales manager")
    public void userSignsInAsSalesManager() {

        loginPage.userName.sendKeys("Salesmanager105");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

    }

    @When("user signs in as Driver")
    public void user_signs_in_as_driver() {

        loginPage.userName.sendKeys("user5");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

    }









}
