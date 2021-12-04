package com.crmly.step_definitions;

import com.crmly.pages.AnnouncementPage;
import com.crmly.pages.LoginPage;
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

import java.util.List;

public class AnnouncementStepDef {

    BrowserUtils browserUtils = new BrowserUtils();
    AnnouncementPage announcementPage = new AnnouncementPage();
    String videoID="";

    @Given("The user logged in")
    public void theUserLoggedIn() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username= ConfigurationReader.get("hr_username");
        String password= ConfigurationReader.get("hr_password");
        new LoginPage().login(username,password);
    }



    @And("User click Upload files and images after clicking upload file icon")
    public void userClickUploadFilesAndImagesAfterClickingUploadFileIcon() {
        browserUtils.waitFor(1);
        announcementPage.UploadFile.click();
    }

    @And("User upload {string} file")
    public void userUploadFile(String fileName) {
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/"+fileName;
        String fullPath = projectPath+"/"+filePath;
        announcementPage.UploadFilesAndImages.sendKeys(fullPath);
        browserUtils.waitFor(6);
        //browserUtils.waitForPageToLoad(5);

    }

    @Then("System display the uploaded {string} file under the Attached files and images section")
    public void systemDisplayTheUploadedFileUnderTheAttachedFilesAndImagesSection(String fileName) {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//*[text()='"+fileName+"']")).isDisplayed());

        announcementPage.delButton.click();
    }


    @When("User clicks Announcement subheading from More tab")
    public void userClicksAnnouncementSubheadingFromMoreTab() {

        browserUtils.waitFor(1);
        announcementPage.More.click();
        browserUtils.waitFor(1);
        announcementPage.Announcement.click();


    }

    @And("User clicks Employees and departments Tab after clicking Add More")
    public void userClicksEmployeesAndDepartmentsTabAfterClickingAddMore() {

        announcementPage.AddMore.click();
        announcementPage.EmployeesAndDepartments.click();


    }

    @And("User select the multiple contacts from list")
    public void userSelectTheMultipleContactsFromList(List<String> ContactNames) {

        for (String ContactName: ContactNames) {
            browserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-info']//div[text()='"+ContactName+"']")).click();
        }

    }

    @Then("User should be able to see selected contacts in To: input box")
    public void userShouldBeAbleToSeeSelectedContactsInToInputBox(List<String> ContactNames) {
        int expectedDisplay = ContactNames.size();
        int actualDisplay= 0;

        for(int i = 0; i<announcementPage.contactNames.size();i++){

            for(int j =0;j<ContactNames.size();j++){
                if(announcementPage.contactNames.get(i).getText().equals(ContactNames.get(j))){
                    actualDisplay++;
                }
            }

        }

        Assert.assertEquals(expectedDisplay,actualDisplay);

    }

    @And("User clicks Add More and type {string} as a contact")
    public void userClicksAddMoreAndTypeAsAContact(String contactName) {

        announcementPage.DeleteAllContactButton.click();
        announcementPage.AddPerson.click();
        announcementPage.ContactInputbox.sendKeys(contactName);

        browserUtils.waitFor(5);


    }


    @Then("User should see the warning of specify at least one person")
    public void userShouldSeeTheWarningOfSpecifyAtLeastOnePerson() {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//span[text()='Please specify at least one person.']")).isDisplayed());

    }


    @And("User clicks Send button")
    public void userClicksSendButton() {
        browserUtils.waitFor(2);
        announcementPage.SendButton.click();
        browserUtils.waitFor(3);

    }

    @And("Write {string} as a content in Announcement")
    public void writeAsAContentInAnnouncement(String content) {

        Driver.get().switchTo().frame((0));

        announcementPage.Content.sendKeys(content);

        Driver.get().switchTo().defaultContent();

    }

    @And("Add {string} contact by clicking to Add more")
    public void addContactByClickingToAddMore(String ContactName) {

        browserUtils.waitFor(1);
        announcementPage.AddMore.click();
        browserUtils.waitFor(1);
        announcementPage.EmployeesAndDepartments.click();
        browserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-info']//div[text()='"+ContactName+"']")).click();
        Driver.get().findElement(By.xpath("//span[@class='popup-window-close-icon']")).click();

    }

    @And("User clicks send")
    public void userClicksSend() {

        browserUtils.waitFor(2);
        announcementPage.SendButton.click();
        browserUtils.waitFor(3);

    }

    @Then("User should be able to see sent Announcement {string} on the top of the Active Stream")
    public void userShouldBeAbleToSeeSentAnnouncementOnTheTopOfTheActiveStream(String content) {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//div[(@class='feed-post-text-block-inner-inner' and text()='"+content+"')]")).isDisplayed());

        browserUtils.waitFor(2);
        announcementPage.ActiveMore.click();
        browserUtils.waitFor(1);
        announcementPage.ActiveDelete.click();
        browserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        browserUtils.waitFor(1);
        alert.accept();
        browserUtils.waitFor(1);

    }

    @Then("User should see the warning of message is not specified")
    public void userShouldSeeTheWarningOfMessageIsNotSpecified() {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//span[text()='The message title is not specified']")).isDisplayed());

    }
}
