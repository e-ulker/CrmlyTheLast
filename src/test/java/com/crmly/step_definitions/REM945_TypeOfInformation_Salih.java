package com.crmly.step_definitions;

import com.crmly.pages.REM945_CompanyPage_Salih;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class REM945_TypeOfInformation_Salih {

    REM945_CompanyPage_Salih companyPage = new REM945_CompanyPage_Salih();


    @When("user should be able to choose {string}")
    public void user_should_be_able_to_choose(String string) throws InterruptedException {

        Select typeOfInformation = new Select(companyPage.typeOfInfoDropdawn);

        typeOfInformation.selectByVisibleText(string);

        String actualOption = typeOfInformation.getFirstSelectedOption().getText();

        Assert.assertEquals("no match",string,actualOption);

    }
}