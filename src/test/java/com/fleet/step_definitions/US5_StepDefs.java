package com.fleet.step_definitions;

import com.fleet.pages.VehicleModelPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US5_StepDefs {

    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }



    @Given("the user click on the Vehicle Model under the Fleet")
    public void the_user_click_on_the_vehicle_model_under_the_fleet() {

        navigateToModule("Fleet","Vehicles Model" );
    }


    // still need to work on

    VehicleModelPage vehicleModelPage = new VehicleModelPage();

    @Then("the user should see following column options")
    public void the_user_should_see_following_column_options(List<String> expectedColumnOptions) {

        System.out.println("expectedColumnOptions = " + expectedColumnOptions);

        //WebElement actualColumnOptions = Driver.getDriver().findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-1165799343\"]/div[2]/div[2]/div[2]/div/table/thead[1]/tr/th[2]/a/span[1]"));
        //System.out.println("actualColumnOptions = " + actualColumnOptions);

        List<String> actualColumnOptions = BrowserUtils.getElementsText(vehicleModelPage.columnOptions);

        System.out.println("actualColumnOptions = " + actualColumnOptions);


        Assert.assertEquals(expectedColumnOptions,actualColumnOptions);


    }





    @Then("the user should see the error message \"\"You do not have permission to perform this action.\"")
    public void the_user_should_see_the_error_message_you_do_not_have_permission_to_perform_this_action() {

        WebElement errorMessage = Driver.getDriver().findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div[2]/div"));

        String actualErrorMessage = errorMessage.getText();

        String expectedErrorMessage = "You do not have permission to perform this action.";

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

    }










}
