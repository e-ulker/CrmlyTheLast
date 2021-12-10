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
    String videoID = "";


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


    //TC01
    @And("User click Upload files and images after clicking upload file iconn")
    public void userClickUploadFilesAndImagesAfterClickingUploadFileIconn() {
        browserUtils.waitFor(1);
        dashboard.UploadFile.click();

    }


    @And("User upload {string} filee")
    public void userUploadFilee(String fileName) {
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/"+fileName;
        String fullPath = projectPath+"/"+filePath;
        dashboard.UploadFilesAndImages.sendKeys(fullPath);
        browserUtils.waitFor(6);
        //browserUtils.waitForPageToLoad(5);

    }


    @Then("System display the uploaded {string} file under the Attached files and images sectionn")
    public void systemDisplayTheUploadedFileUnderTheAttachedFilesAndImagesSectionn(String fileName) {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//*[text()='"+fileName+"']")).isDisplayed());

        dashboard.delButton.click();

    }








    //TC04
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

        for (String ContactName : ContactNames) {
            browserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-info']//div[text()='" + ContactName + "']")).click();
        }


    }


    @Then("User should be able to see selected contacts in To: input boxx")
    public void userShouldBeAbleToSeeSelectedContactsInToInputBoxx(List<String> ContactNames) {
        int expectedDisplay = ContactNames.size();
        int actualDisplay = 0;

        for (int i = 0; i < appreciationPage.contactNames.size(); i++) {

            for (int j = 0; j < ContactNames.size(); j++) {
                if (appreciationPage.contactNames.get(i).getText().equals(ContactNames.get(j))) {
                    actualDisplay++;
                }
            }

        }

        Assert.assertEquals(expectedDisplay, actualDisplay);

    }


    //TC05
    @When("User clicks Appreciation subheading from More tab")
    public void user_clicks_Appreciation_subheading_from_More_tab() {
        browserUtils.waitFor(1);
        dashboard.More.click();
        browserUtils.waitFor(1);
        dashboard.Appreciation.click();
        appreciationPage.DeleteAllContactButton.click();
    }

    @And("User clicks link icon")
    public void userClicksLinkIcon() {
        dashboard.Link.click();
    }

    @And("User enters link text {string} and link URL {string}")
    public void userEntersLinkTextAndLinkURL(String text, String URL) {
        browserUtils.waitFor(3);
        appreciationPage.LinkText.sendKeys(text);
        appreciationPage.LinkURL.sendKeys(URL);

    }

    @And("User clicks Save button")
    public void userClicksSaveButton() {
        appreciationPage.SaveButton.click();
    }

    @Then("User should see attached link which has only Link URL or LinkText and URL {string} {string}")
    public void userShouldSeeAttachedLinkWhichHasOnlyLinkURLOrLinkTextAndURL(String text, String url) {
        browserUtils.waitFor(2);
        Driver.get().switchTo().frame(0);
        if (text.isEmpty()) {
            Assert.assertTrue(Driver.get().findElement(By.linkText(url)).isDisplayed());
        } else {
            Assert.assertTrue(Driver.get().findElement(By.linkText(text)).isDisplayed());
        }

    }


    //TC06



    @And("User clicks link iconn")
    public void userClicksLinkIconn() {
        dashboard.Link.click();

    }


    @And("User enters link text {string} and linkk URL {string}")
    public void userEntersLinkTextAndLinkkURL(String text, String URL) {
        browserUtils.waitFor(3);
        appreciationPage.LinkText.sendKeys(text);
        appreciationPage.LinkURL.sendKeys(URL);
    }


    @And("User clicks Save buttonn")
    public void userClicksSaveButtonn() {
        appreciationPage.SaveButton.click();
    }


    @Then("Verify that user shouldn't be able to attach link {string} without linkk URL")
    public void verifyThatUserShouldnTBeAbleToAttachLinkWithoutLinkkURL(String text) {
        browserUtils.waitFor(2);
        Driver.get().switchTo().frame(0);

        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().findElement(By.linkText(text)).isDisplayed());

    }


    //TC07


    @And("User clicks insert video iconn")
    public void userClicksInsertVideoIconn() {
        appreciationPage.InsertVideoButton.click();

    }


    @And("User enterss {string}")
    public void userEnterss(String videoURL) {
        browserUtils.waitFor(1);
        appreciationPage.VideoURL.sendKeys(videoURL);
        browserUtils.waitFor(13);

    }


    @And("User click Save buttonn")
    public void userClickSaveButtonn() {
        appreciationPage.VideoSaveButton.click();

    }


    @Then("User should be able to see inserted videoo {string}")
    public void userShouldBeAbleToSeeInsertedVideoo(String videoUrlLink) {
        int size = Driver.get().findElements(By.tagName("iframe")).size();

        //  for(int i=0; i<=size; i++){
        //  Driver.get().switchTo().frame(i);
        //  int total=Driver.get().findElements(By.xpath("//link[@href='"+videoUrlLink+"']")).size();
        //  System.out.println(total);
        //  Driver.get().switchTo().defaultContent();}

        browserUtils.waitFor(2);
        Driver.get().switchTo().frame((size-1));
        browserUtils.waitFor(2);
        Assert.assertTrue("User should see the inserted videos",Driver.get().findElement(By.xpath("//link[@href='"+videoUrlLink+"']")).isEnabled());
        appreciationPage.DeleteVideo.click();
    }



//TC08

    @And("User enters invalid videoo URL {string}")
    public void userEntersInvalidVideooURL(String invalidVideoURL) {
        browserUtils.waitFor(1);
        appreciationPage.VideoURL.sendKeys(invalidVideoURL);
        browserUtils.waitFor(2);

    }



    @Then("User should see the warning Incorrectt URL")
    public void userShouldSeeTheWarningIncorrecttURL() {
        Assert.assertTrue(Driver.get().findElement(By.xpath("//span[contains(text(),'Incorrect UR')]")).isDisplayed());
    }

    //TC09

    @And("Write {string} as a content in Appreciationn")
    public void writeAsAContentInAppreciationn(String content) {
        Driver.get().switchTo().frame((0));

        appreciationPage.Content.sendKeys(content);

        Driver.get().switchTo().defaultContent();
    }


    @And("Add {string} contact by clicking to Add moree")
    public void addContactByClickingToAddMoree(String ContactName) {

        browserUtils.waitFor(1);
        appreciationPage.AddMore.click();
        browserUtils.waitFor(1);
        appreciationPage.EmployeesAndDepartments.click();
        browserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-info']//div[text()='"+ContactName+"']")).click();
        Driver.get().findElement(By.xpath("//span[@class='popup-window-close-icon']")).click();


    }

    @And("User clicks sendd")
    public void userClicksSendd() {
        browserUtils.waitFor(2);
        appreciationPage.SendButton.click();
        browserUtils.waitFor(3);

    }

    @Then("User should be able to see sent Appreciation {string} on the top of the Active Streamm")
    public void userShouldBeAbleToSeeSentAppreciationOnTheTopOfTheActiveStreamm(String content) {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//div[(@class='feed-post-text-block-inner-inner' and text()='"+content+"')]")).isDisplayed());

        browserUtils.waitFor(2);
        dashboard.ActiveMore.click();
        browserUtils.waitFor(1);
        dashboard.ActiveDelete.click();
        browserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        browserUtils.waitFor(1);
        alert.accept();
        browserUtils.waitFor(1);



    }

    //TC010
    @Then("User should see the warning of message is not specifiedd")
    public void userShouldSeeTheWarningOfMessageIsNotSpecifiedd() {
        Assert.assertTrue(Driver.get().findElement(By.xpath("//span[text()='The message title is not specified']")).isDisplayed());

    }

    //TC011
    @Then("User should see the warning of specify at least one personn")
    public void userShouldSeeTheWarningOfSpecifyAtLeastOnePersonn() {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//span[text()='Please specify at least one person.']")).isDisplayed());
    }


    @Then("System display the name of uploaded file as {string}")
    public void systemDisplayTheNameOfUploadedFileAs(String expectedFileName) {
        String actualFileName= Driver.get().findElement(By.xpath("//div[@id='feed-add-post-content-message']//tbody[@class='diskuf-placeholder-tbody']//span[@class='f-wrap']")).getText();
        Assert.assertEquals(expectedFileName,actualFileName);
        dashboard.delButton.click();

    }
}
