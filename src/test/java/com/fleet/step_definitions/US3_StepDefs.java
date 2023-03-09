package com.fleet.step_definitions;

import com.fleet.pages.PinbarPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.fleet.utilities.BrowserUtils.*;

public class US3_StepDefs {


    PinbarPage pinbarPage = new PinbarPage();


    @Then("user click the pinbarLink on the homepage")
    public void userClickThePinbarLinkOnTheHomepage() {
        WebElement link = pinbarPage.pinbarLink;
        BrowserUtils.sleep(2);
        link.click();

    }

   @Then("user see first message {string}")
   public void userSeeFirstMessage(String firstMessage) {
       String actualMessage = pinbarPage.firstPinbarMessage.getText();
       Assert.assertEquals(actualMessage, firstMessage);
   }

   @Then("user see second message {string}")
   public void userSeeSecondMessage(String secondMessage) {

       String actualMessage = pinbarPage.secondPinbarMessage.getText();
       Assert.assertEquals(actualMessage, secondMessage);

   }

    @Then("user see pinbarImage")
    public void userSeePinbarImage() {


        WebElement image = pinbarPage.pinbarImage;

        waitForVisibility(image, 10);
        String actualImageSource = image.getAttribute("src");

        String expectedImageSource = "https://qa.intabella.com/bundles/oronavigation/images/pinbar-location.jpg";

        Assert.assertEquals(actualImageSource, expectedImageSource);

    }

}
