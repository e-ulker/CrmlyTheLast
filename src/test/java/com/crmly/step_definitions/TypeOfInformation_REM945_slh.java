package com.crmly.step_definitions;

import com.crmly.pages.CompanyPage_REM945_slh;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class TypeOfInformation_REM945_slh {

    CompanyPage_REM945_slh companyPage = new CompanyPage_REM945_slh();


    @When("user should be able to choose {string}")
    public void user_should_be_able_to_choose(String string) throws InterruptedException {

        Select typeOfInformation = new Select(companyPage.typeOfInfoDropdawn);

        typeOfInformation.selectByVisibleText(string);

        String actualOption = typeOfInformation.getFirstSelectedOption().getText();

        Assert.assertEquals("no match",string,actualOption);

    }
}