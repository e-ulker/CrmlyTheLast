package com.crmly.step_definitions;

import com.crmly.pages.CompanyPage_REM945_slh;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PreCondition_REM945_slh {


    CompanyPage_REM945_slh companyPage = new CompanyPage_REM945_slh();


    @And("the user click the company")
    public void the_user_click_the_company() {

        companyPage.company.click();

    }

    @When("the user click the add news button")
    public void the_user_click_the_add_news_button() {

        companyPage.addNewsButton.click();

    }

    @Then("The preview text open")
    public void the_preview_text_open() {

        Assert.assertTrue(companyPage.getPreviewTextTab.isDisplayed());

    }



}
