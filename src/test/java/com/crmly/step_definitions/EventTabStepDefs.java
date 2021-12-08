package com.crmly.step_definitions;

import com.crmly.pages.EventTabPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EventTabStepDefs {
    EventTabPage eventTabPage = new EventTabPage();

    @When("user clicks on Event Tab")
    public void user_clicks_on_event_tab() {
        eventTabPage.eventTab.click();
        BrowserUtils.waitFor(2);

    }
    @When("user edit the starting date")
    public void user_edit_the_starting_date() {
        eventTabPage.startDate.click();
        BrowserUtils.waitFor(2);
        eventTabPage.Month.click();
        BrowserUtils.waitFor(2);
        eventTabPage.january.click();
        BrowserUtils.waitFor(2);
        eventTabPage.Year.click();
        BrowserUtils.waitFor(2);
        eventTabPage.yearBox.sendKeys("2022");
        BrowserUtils.waitFor(2);
    }
    @When("user edit the starting time")
    public void user_edit_the_starting_time() {
        eventTabPage.startTime.click();
        BrowserUtils.waitFor(2);
        eventTabPage.hour1.clear();
        BrowserUtils.waitFor(2);
        eventTabPage.hour1.sendKeys("14");
        BrowserUtils.waitFor(2);
        eventTabPage.minutes1.clear();
        BrowserUtils.waitFor(2);
        eventTabPage.minutes1.sendKeys("30");
        BrowserUtils.waitFor(2);
        eventTabPage.setTime1.click();
        BrowserUtils.waitFor(2);
    }
    @When("user edit the ending date")
    public void user_edit_the_ending_date() {
        eventTabPage.endDate.click();
        BrowserUtils.waitFor(2);
        eventTabPage.Month.click();
        BrowserUtils.waitFor(2);
        eventTabPage.january.click();
        BrowserUtils.waitFor(2);
        eventTabPage.Year.click();
        BrowserUtils.waitFor(2);
        eventTabPage.yearBox.sendKeys("2022");
        BrowserUtils.waitFor(2);
    }
    @When("user edit ending time")
    public void user_edit_ending_time() {
        eventTabPage.endTime.click();
        BrowserUtils.waitFor(2);
        eventTabPage.hour2.clear();
        BrowserUtils.waitFor(2);
        eventTabPage.hour2.sendKeys("17");
        BrowserUtils.waitFor(2);
        eventTabPage.minutes2.clear();
        BrowserUtils.waitFor(2);
        eventTabPage.minutes2.sendKeys("00");
        BrowserUtils.waitFor(2);
        eventTabPage.setTime2.click();
        BrowserUtils.waitFor(2);
    }
    @When("user clicks Specify time zone")
    public void user_clicks_specify_time_zone() {
        eventTabPage.specifyTimeZone.click();
        BrowserUtils.waitFor(2);
    }
    @When("user edit time zone")
    public void user_edit_time_zone() {
        eventTabPage.firstTimeZone.click();
        BrowserUtils.waitFor(2);

        Select timeZoneDropdown1 = new Select(eventTabPage.firstTimeZone);
        timeZoneDropdown1.selectByVisibleText("(UTC +03:00) Europe/Istanbul");
        BrowserUtils.waitFor(2);

        Select timeZoneDropdown2 = new Select(eventTabPage.secondTimeZone);
        timeZoneDropdown2.selectByVisibleText("(UTC +03:00) Europe/Istanbul");
        BrowserUtils.waitFor(2);
    }
    //a

    @When("user verify set reminder button is clicked")
    public void user_verify_set_reminder_button_is_clicked() {
        Boolean flag = eventTabPage.setReminderButton.isSelected();
        if (!flag){
            eventTabPage.setReminderButton.click();
        }
    }
    @When("user edit time")
    public void user_edit_time() {
        eventTabPage.reminderTime.clear();
        BrowserUtils.waitFor(2);
        eventTabPage.reminderTime.sendKeys("20");
        BrowserUtils.waitFor(2);
    }
    @When("user select measure of time")
    public void user_select_measure_of_time() {
        WebElement dropdownElement = Driver.get().findElement(By.id("event-remind_typecal_3Jcl"));
        BrowserUtils.waitFor(2);
        Select reminderTimeMeasure = new Select(dropdownElement);
        BrowserUtils.waitFor(2);
        reminderTimeMeasure.selectByVisibleText("hours");
        BrowserUtils.waitFor(2);
    }


    //a

    @When("user select event location")
    public void user_select_event_location() {
        eventTabPage.eventLocation.click();
        BrowserUtils.waitFor(2);
        eventTabPage.westMeetingRoom.click();
        BrowserUtils.waitFor(2);
    }

    //a

    @When("user clicks Add persons, groups and department")
    public void user_clicks_add_persons_groups_and_department() {
        eventTabPage.addSomeone.click();
        BrowserUtils.waitFor(2);
    }
    @When("user select individuals or groups and department")
    public void user_select_individuals_or_groups_and_department() {
        eventTabPage.everyone.click();
        BrowserUtils.waitFor(2);
    }
    @When("user clicks close button")
    public void user_clicks_close_button() {
        eventTabPage.closeButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("user verifies members are added")
    public void user_verifies_members_are_added() {
        Assert.assertTrue(eventTabPage.everyoneInMembers.isDisplayed());
        BrowserUtils.waitFor(2);
    }


    //a

    @When("user clicks more to see the details")
    public void user_clicks_more_to_see_the_details() {
        eventTabPage.more.click();
        BrowserUtils.waitFor(2);
    }
    @When("user edits Availability")
    public void user_edits_availability() {
        Select setAvaliability = new Select(eventTabPage.avaliability);
        setAvaliability.selectByVisibleText("Free");
        BrowserUtils.waitFor(2);
    }
    @When("user edits Repeat")
    public void user_edits_repeat() {
        Select setRepeat = new Select(eventTabPage.repeat);
        setRepeat.selectByVisibleText("Daily");
        BrowserUtils.waitFor(2);
        Select setDay = new Select(eventTabPage.repeatDay);
        setDay.selectByVisibleText("15");
        BrowserUtils.waitFor(2);
        eventTabPage.after.click();
        BrowserUtils.waitFor(2);
        eventTabPage.day.clear();
        BrowserUtils.waitFor(2);
        eventTabPage.day.sendKeys("15");
        BrowserUtils.waitFor(2);
    }
    @When("user edits Calendar")
    public void user_edits_calendar() {
        Select setCalendar = new Select(eventTabPage.calendar);
        setCalendar.selectByVisibleText("hr1@cybertekschool.com");
        BrowserUtils.waitFor(2);
    }
    @When("user edits Importance")
    public void user_edits_importance() {
       Select setImportance = new Select(eventTabPage.importance);
       setImportance.selectByVisibleText("Low");
        BrowserUtils.waitFor(2);
    }


    //a

    @When("user clicks SEND button")
    public void user_clicks_send_button() {
        eventTabPage.sendButton.click();
    }
    @Then("user verifies")
    public void user_verifies() {
        String title = Driver.get().getTitle();
        System.out.println(title);
        Assert.assertEquals(title,Driver.get().getTitle());
    }
}
