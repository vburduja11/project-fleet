package com.fleet.step_definitions;

import com.fleet.pages.VehiclesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.fleet.utilities.BrowserUtils.*;
import static org.apache.commons.lang.math.RandomUtils.nextInt;

public class US7_StepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Then("user should see all checkboxes should be unchecked")
    public void userShouldSeeAllCheckboxesShouldBeUnchecked() {

        List<WebElement> allCheckboxes = vehiclesPage.vehicleCheckbox;
        //allCheckboxes.get(5).click();
        Assert.assertTrue(unselected(allCheckboxes));

    }

    @Then("the user checks the first checkbox")
    public void theUserChecksTheFirstCheckbox() {
        WebElement firstCheckbox = vehiclesPage.allVehiclesCheckbox;
        selectCheckBox(firstCheckbox, true);

    }

    @Then("the user should see all checkboxes are selected")
    public void theUserShouldSeeAllCheckboxesAreSelected() {

        List<WebElement> allCheckboxes = vehiclesPage.vehicleCheckbox;
        Assert.assertTrue(allSelected(allCheckboxes));

    }

    @Then("the user checks any checkbox")
    public void theUserChecksAnyCheckbox() {

        List<WebElement> allCheckboxes = vehiclesPage.vehicleCheckbox;
        Random rand = new Random();
        int index = nextInt(allCheckboxes.size()-1);
        WebElement randomCheckbox =  allCheckboxes.get(index);
        randomCheckbox.click();
        Assert.assertTrue(randomCheckbox.isSelected());

    }

}
