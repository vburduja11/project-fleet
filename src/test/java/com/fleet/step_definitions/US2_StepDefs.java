package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import io.cucumber.java.en.And;

public class US2_StepDefs {

    @And("the user click on the question icon")
    public void theUserClickOnTheQuestionIcon() {
        new DashboardPage().waitUntilLoaderScreenDisappear();
        new DashboardPage().questionIcon.click();


    }

}
