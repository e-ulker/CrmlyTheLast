package com.crmly.step_definitions;

import com.crmly.pages.Dashboard;
import com.crmly.pages.LoginPage;
import com.crmly.pages.US019_AppreciationPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US019_AppreciationStepDefs {

    US019_AppreciationPage Appreciate = new US019_AppreciationPage();

    @When("the user clickss the {string} button")
    public void the_user_clickss_the_button(String buttonName) {


    }

    @Then("Appreciation window is displayed")
    public void appreciationWindowIsDisplayed() {
        Assert.assertTrue(Appreciate.AppreciationWindow.isDisplayed());

    }

    @When("the user clickss the MORE button")
    public void theUserClickssTheMOREButton() {
        Appreciate.More.click();
    }

    @And("the user clickss the Appreciation button")
    public void theUserClickssTheAppreciationButton() {
        Appreciate.Appreciation.click();
    }







}
