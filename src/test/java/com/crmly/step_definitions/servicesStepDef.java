package com.crmly.step_definitions;

import com.crmly.pages.ServicesPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import java.util.ArrayList;
import java.util.List;


public class servicesStepDef {

    ServicesPage servicesPage = new ServicesPage();

    @Given("user should be click the services")
    public void userShouldBeClickTheServices() {
        servicesPage.services.click();


    }

    @When("user should be able to click ideas")
    public void userShouldBeAbleToClickIdeas() {
        BrowserUtils.waitFor(1);
        servicesPage.ideas.click();
    }

    @When("user should be able to click new idea button")
    public void userShouldBeAbleToClickNewIdeaButton() {
        BrowserUtils.waitFor(1);
        servicesPage.newidea.click();
    }


    @Then("user should enter the title {string},idea {string}")
    public void userShouldEnterTheTitleIdea(String title, String text) {
        BrowserUtils.waitFor(1);
        servicesPage.title.sendKeys(title);

        Driver.get().switchTo().frame(servicesPage.textFrame);

        servicesPage.text.sendKeys(text);

        Driver.get().switchTo().defaultContent();
        servicesPage.submitIdea.click();
        BrowserUtils.waitFor(1);
    }

    @Then("verify the idea on the ideas page title {string},idea {string}")
    public void verifyTheIdeaOnTheIdeasPageTitleIdea(String title, String text) {

        WebElement verifyTitle = Driver.get().findElement(By.xpath("//h2/a[text()='"+title+"']"));

        Assert.assertEquals(title,verifyTitle.getText());


        Assert.assertEquals(text,servicesPage.veriftText.getText());
    }

    @Then("user should be dislike the any idea")
    public void userShouldBeDislikeTheAnyIdea() {
        BrowserUtils.waitFor(2);
        servicesPage.minusIcon.click();

    }

    @Then("user should be like the any idea")
    public void userShouldBeLikeTheAnyIdea() {
        BrowserUtils.waitFor(2);
        servicesPage.plusIcon.click();

    }


    @Then("user should be sort the rating")
    public void userShouldBeSortTheRating() {

        servicesPage.rating.click();

        BrowserUtils.waitFor(3);

       List<String> ratings = BrowserUtils.getElementsText(servicesPage.ratingNums);

       System.out.println(ratings);



    }
}
