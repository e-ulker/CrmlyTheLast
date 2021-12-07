package com.crmly.step_definitions;

import com.crmly.pages.EmployeePage;
import com.crmly.pages.LoginPage;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;


public class EmployeeFunctionsStepDefs {

    EmployeePage employeePage = new EmployeePage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Assert.assertTrue(Driver.get().getTitle().contains("Authorization"));
    }

    @And("The user logs in with {string} username and {string} password")
    public void theUserLogsInWithUsernameAndPassword(String userName, String password) {
        String username = ConfigurationReader.get(userName + "_username");
        String passWord = ConfigurationReader.get("all_password");
        new LoginPage().login(username, passWord);
        Assert.assertTrue(Driver.get().getCurrentUrl().equals("https://qa.crmly.net/stream/?login=yes"));
    }

    @When("User navigates to Employee module from left side menu")
    public void user_navigates_to_Employee_module_from_left_side_menu() {
        employeePage.employeeBtn.click();
        Assert.assertTrue(Driver.get().getTitle().contains("Company Structure"));
    }

    @Then("User should be able to display Company Structure")
    public void user_should_be_able_to_display_Company_Structure() {
        String pageSubtitle = employeePage.compStrSubtitle.getText();
        Assert.assertEquals("Company Structure", pageSubtitle);
    }


    @And("User clicks Add Department button")
    public void userClicksAddDepartmentButton() {
        employeePage.addDepartmentBtn.click();
    }

    @And("User types a name for department")
    public void userTypesANameForDepartment() {
        employeePage.deptNameField.sendKeys("QA Dept.");
    }

    @And("User selects the parent department")
    public void userSelectsTheParentDepartment() {
        employeePage.selectDepartment();
    }

    @Then("User clicks Add button")
    public void userClicksAddButton() {
        employeePage.addBtn.click();
    }
}
