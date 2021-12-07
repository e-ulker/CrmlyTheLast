package com.crmly.step_definitions;

import com.crmly.pages.ApplicationsPage;
import com.crmly.pages.DashboardPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

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
        Assert.assertTrue(application.newApplications.size() > 0);
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

        Assert.assertEquals(expectedWarningMessage, actualWarningMessage);
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

    @Then("User should be able to hide Webhooks")
    public void userShouldBeAbleToHideWebhooks() {
        application.moreBtn.click();
        BrowserUtils.waitFor(2);
        application.configureMenuTop.click();
        application.webhooksEditBtn.click();
        application.webhooksHideBtn.click();
        BrowserUtils.waitFor(2);
        Assert.assertFalse(application.webhooks.isDisplayed());
    }

    @And("User should be able to show Webhooks")
    public void userShouldBeAbleToShowWebhooks() {
        application.webhooksEditBtnForShow.click();
        application.webhooksShowBtn.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(application.webhooks.isDisplayed());
    }

    @Then("User should be able to add Marketplace to the left menu")
    public void userShouldBeAbleToAddMarketplace() {
        application.moreBtn.click();
        application.configureMenuTop.click();
        BrowserUtils.waitFor(2);
        application.itemEditForMarketplace.click();
        application.addToLeftMenu.click();
        Assert.assertTrue(application.leftMenuMarketplace.isDisplayed());
        
    }

    @And("User should be able to remove Marketplace from the left menu")
    public void userShouldBeAbleToRemoveWebhooks() {

        application.bottomConfigureMenu.click();
        application.bottomConfigureMenuItems.click();
        BrowserUtils.waitFor(2);
        application.editIconForMarketPlace.click();
        application.removeFromMenu.click();
        BrowserUtils.waitFor(2);

        for (WebElement contentMenuItem : application.contentMenuItems) {
            Assert.assertNotEquals("Marketplace", contentMenuItem.getText());
        }

    }

    @Then("User should be able to set Installed as the section home page")
    public void userShouldBeAbleToSetInstalledAsTheSectionHomePage() {
        application.moreBtn.click();
        application.configureMenuTop.click();
        application.editInstalled.click();
        application.setAsSectionHomePage.click();
        BrowserUtils.waitFor(2);

        Assert.assertEquals("Installed", application.menuItems.get(0).getText());

    }
}
