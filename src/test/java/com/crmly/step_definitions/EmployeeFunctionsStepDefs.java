package com.crmly.step_definitions;

import com.crmly.pages.EmployeePage;
import com.crmly.pages.LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class EmployeeFunctionsStepDefs {

    EmployeePage employeePage = new EmployeePage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        //Assert.assertTrue(Driver.get().getTitle().contains("Authorization"));
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

    @When("User navigates Find Employee tab")
    public void userNavigatesFindEmployeeTab() {
        employeePage.navigateToTab("Find Employee");
        Assert.assertEquals("Find Employee", employeePage.FindEmp.getText());

    }

    @And("User writes an {string} in search box")
    public void userWritesAnInSearchBox(String employeeName) {
        employeePage.searchBar.sendKeys(employeeName);
    }


    @Then("User clicks search button")
    public void userClicksSearchButton() {
        employeePage.searchButton.click();
        BrowserUtils.waitFor(3);
    }


    @And("User clicks Search by Alphabet")
    public void userClicksSearchByAlphabet() {
        employeePage.searchByAlphabet.click();
    }

    @And("User picks a letter to search an employee")
    public void userPicksALetterToSearchAnEmployee() {
        employeePage.searchByLetter("D");
        String actualName = Driver.get().findElement(By.xpath("//a[normalize-space()='Cristopher Debua']")).getText();
        Assert.assertTrue(actualName.contains("Debua"));
    }

    @And("User clicks on More button")
    public void userClicksOnMoreButton() {
        employeePage.moreButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("User clicks on Export to Excel")
    public void userClicksOnExportToExcel() {
        employeePage.exportButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(employeePage.isFileDownloaded(employeePage.downloadPath,"users.xls"));
        BrowserUtils.waitFor(2);
    }
}
