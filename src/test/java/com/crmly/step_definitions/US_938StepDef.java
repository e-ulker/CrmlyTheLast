package com.crmly.step_definitions;

import com.crmly.pages.US_938DashboardPage;
import com.crmly.pages.US_938TaskPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class US_938StepDef {
    US_938TaskPage tasksPage = new US_938TaskPage();
    @When("the user click on Tasks")
    public void the_user_click_on_Tasks() {
        US_938DashboardPage dashBoardPage = new US_938DashboardPage();
        dashBoardPage.Tasks.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user click on New Task")
    public void the_user_click_on_New_Task() {

        tasksPage.newTask.click();
    }

    @Then("the user click on the High Priority checkbox")
    public void the_user_click_on_the_High_Priority_checkbox() {

        Driver.get().switchTo().frame(tasksPage.iframe);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        executor.executeScript("arguments[0].click();", tasksPage.checkbox);

    }

    @Then("Verify the checkbox is selected")
    public void the_checkbox_is_clicked() {

        tasksPage.checkbox.isSelected();
    }

    @Then("the user click on the Visual Editor")
    public void theUserClickOnTheVisualEditor() {
     Driver.get().switchTo().frame(tasksPage.iframe);
     tasksPage.visualEditor.click();
    }

    @And("Verify textbar is displayed")
    public void verifyTextbarIsDisplayed() {
     tasksPage.textbar.isDisplayed();
    }
}
