package com.crmly.step_definitions;

import com.crmly.pages.ApplicationsPage;
import com.crmly.pages.DashboardPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ApplicationsStepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    ApplicationsPage application = new ApplicationsPage();

    @When("user should be able to click {string}")
    public void userShouldBeAbleToClick(String menuName) {
        BrowserUtils.waitFor(1);
        dashboardPage.moreButton.click();
        BrowserUtils.waitFor(1);
        dashboardPage.navigateActiveStream(menuName);
    }

    @Then("user should be able to display the new applications")
    public void userShouldBeAbleToDisplayTheNewApplications() {
        Assert.assertTrue(application.newApplications.size()>0);
    }

    @And("user should be able to click VIEW")
    public void userShouldBeAbleToClickVIEW() {
        application.viewButton.click();
    }

    @And("user should be able to click INSTALL")
    public void userShouldBeAbleToClickINSTALL() {
        BrowserUtils.waitFor(1);
        Driver.get().switchTo().frame(application.iframeElement);
        BrowserUtils.waitFor(1);
        application.installButton.click();
    }

    @Then("user should be able to send a request for installing")
    public void userShouldBeAbleToSendARequestForInstalling() {

        BrowserUtils.waitFor(1);
        application.sendButton.click();
        String actualWarningMessage = application.popUpAlert.getText();

        String expectedWarningMessage = "Your request to install the app has been sent to\n" +
                "your Bitrix24's administrators. Thank you!";

        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);
    }

    @Then("user should be able to display the application's features")
    public void userShouldBeAbleToDisplayTheApplicationSFeatures(List<String> features) {

        Driver.get().switchTo().frame(application.iframeElement);
        BrowserUtils.waitFor(2);

        if (features.size() == application.contentMenuFeatures.size()) {
            for (int i = 0; i < features.size(); i++) {
                application.clickFeatureLink(features.get(i));
                BrowserUtils.waitFor(2);
                Assert.assertEquals(features.get(i), application.contentMenuFeatures.get(i).getText());
            }
        }
    }

    @Then("user should be able to display")
    public void userShouldBeAbleToDisplay(List<String> titles) {
        if (titles.size() == application.titleMenuTexts.size()) {
            for (int i = 0; i < titles.size(); i++) {
                application.clickTitleLink(titles.get(i));
                BrowserUtils.waitFor(2);
                Assert.assertEquals(titles.get(i), application.titleMenuTexts.get(i).getText());
            }
        }

    }
}
