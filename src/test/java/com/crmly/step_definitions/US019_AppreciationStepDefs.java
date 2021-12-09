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

    US019_AppreciationPage appreciationPage = new US019_AppreciationPage();


    Dashboard dashboard = new Dashboard();
    BrowserUtils browserUtils = new BrowserUtils();
   // AppreciationPage appreciationPage = new AppreciationPage();
    String videoID="";



    @When("the user clickss the {string} button")
    public void the_user_clickss_the_button(String buttonName) {

    }

    @Then("Appreciation window is displayed")
    public void appreciationWindowIsDisplayed() {
        Assert.assertTrue(appreciationPage.AppreciationWindow.isDisplayed());

    }

    @When("the user clickss the MORE button")
    public void theUserClickssTheMOREButton() {
        appreciationPage.More.click();
    }

    @And("the user clickss the Appreciation button")
    public void theUserClickssTheAppreciationButton() {
        appreciationPage.Appreciation.click();
    }


//AC04
@When("User clicks Appreciation subheading from More tabb")
public void userClicksAppreciationSubheadingFromMoreTabb() {

    browserUtils.waitFor(1);
    dashboard.More.click();
    browserUtils.waitFor(1);
    dashboard.Appreciation.click();
    appreciationPage.DeleteAllContactButton.click();
}


    @And("User clicks Employees and departments Tab after clicking Add Moree")
    public void userClicksEmployeesAndDepartmentsTabAfterClickingAddMoree() {

        appreciationPage.AddMore.click();
        appreciationPage.EmployeesAndDepartments.click();
    }


    @And("User select the multiple contacts from listt")
    public void userSelectTheMultipleContactsFromListt(List<String> ContactNames) {

        for (String ContactName: ContactNames) {
            browserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-info']//div[text()='"+ContactName+"']")).click();
        }


    }


    @Then("User should be able to see selected contacts in To: input boxx")
    public void userShouldBeAbleToSeeSelectedContactsInToInputBoxx(List<String> ContactNames) {
        int expectedDisplay = ContactNames.size();
        int actualDisplay= 0;

        for(int i = 0; i<appreciationPage.contactNames.size();i++){

            for(int j =0;j<ContactNames.size();j++){
                if(appreciationPage.contactNames.get(i).getText().equals(ContactNames.get(j))){
                    actualDisplay++;
                }
            }

        }

        Assert.assertEquals(expectedDisplay,actualDisplay);

    }




}
