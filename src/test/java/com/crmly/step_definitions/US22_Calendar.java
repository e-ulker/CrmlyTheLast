package com.crmly.step_definitions;

import com.crmly.pages.US22_CompanyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US22_Calendar {

    US22_CompanyPage companyPage = new US22_CompanyPage();


    @When("write any date to date inputBox {string}")
    public void write_any_date_to_date_inputBox(String pattern) throws InterruptedException {

        companyPage.dateInputBox.click();
        companyPage.dateInputBox.clear();

        DateFormat toFormat = new SimpleDateFormat(pattern);

        Date actualDate = new Date();

        String dateForInputBox = toFormat.format(actualDate);

        System.out.println("date for inputBox = " + dateForInputBox);

        companyPage.dateInputBox.sendKeys(dateForInputBox);

    }

    @When("click select date icon")
    public void click_select_date_icon() {

        companyPage.selectDateIcon.click();

    }

    @When("verify actual day is selected {string}")
    public void verify_actual_day_is_selected(String ddPattern) {

        companyPage.actualDay(ddPattern);
    }

    @Then("verify actual month is selected {string}")
    public void verify_actual_month_is_selected(String MMPattern) {

        companyPage.actualMonth(MMPattern);

    }

    @Then("verify actual year is selected {string}")
    public void verify_actual_year_is_selected(String yyyyPattern) {

        companyPage.actualYear(yyyyPattern);

    }

    @And("click the month dropDawn menu")
    public void clickTheMonthDropDawnMenu() {

        companyPage.month.click();

    }

    @When("user should be able to select a {string}")
    public void userShouldBeAbleToSelecta(String sendMonth) {

        companyPage.chooseMonth(sendMonth);

    }

    @And("click the year dropDawn menu")
    public void clickTheYearDropDawnMenu() {

        companyPage.yearDropDawn.click();

    }

    @When("user should be able to select {string}")
    public void userShouldBeAbleToSelect(String year) {

        companyPage.selectYear(year);

    }

    @Then("choose a day")
    public void chooseADay() {

        companyPage.chooseDay();

    }

    @When("click Set Time icon")
    public void clickSetTimeIcon() {

        companyPage.setTimeIcon.click();

    }

    @And("user should be able to set hour")
    public void userShouldBeAbleToSetHour() {

        companyPage.setHour();

    }

    @Then("user should be able to set minute")
    public void userShouldBeAbleToSetMinute() {

        companyPage.setMinute();
    }

    @And("user should be able to set AM_PM")
    public void userShouldBeAbleToSetAMPM() {

        companyPage.setAmPm();

    }
}
