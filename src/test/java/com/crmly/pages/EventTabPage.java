package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventTabPage extends BasePage {

    @FindBy(xpath = "//span/span[.=\"Event\"]")
    public WebElement eventTab;

    @FindBy(id = "feed-cal-event-fromcal_3Jcl")
    public WebElement startDate;

    @FindBy(id = "feed_cal_event_from_timecal_3Jcl")
    public WebElement startTime;

    @FindBy(id = "feed-cal-event-tocal_3Jcl")
    public WebElement endDate;

    @FindBy(id = "feed_cal_event_to_timecal_3Jcl")
    public WebElement endTime;

    @FindBy(xpath = "//span[.=\"Specify time zone\"]")
    public WebElement specifyTimeZone;

    @FindBy(id = "feed-cal-tz-fromcal_3Jcl")
    public WebElement firstTimeZone;

    @FindBy(id = "feed-cal-tz-tocal_3Jcl")
    public WebElement secondTimeZone;

    @FindBy(xpath = "//a[@class='bx-calendar-top-month']")
    public WebElement Month;

    @FindBy(xpath = "//a[@class='bx-calendar-top-year']")
    public WebElement Year;

    //MONTHS
    @FindBy(xpath = "//span[.=\"January\"]")
    public WebElement january;

    @FindBy(xpath = "//span[.=\"February\"]")
    public WebElement february;

    @FindBy(xpath = "//span[.=\"March\"]")
    public WebElement march;

    @FindBy(xpath = "//span[.=\"April\"]")
    public WebElement april;

    @FindBy(xpath = "//span[.=\"May\"]")
    public WebElement may;

    @FindBy(xpath = "//span[.=\"June\"]")
    public WebElement june;

    @FindBy(xpath = "//span[.=\"July\"]")
    public WebElement july;

    @FindBy(xpath = "//span[.=\"August\"]")
    public WebElement august;

    @FindBy(xpath = "//span[.=\"September\"]")
    public WebElement september;

    @FindBy(xpath = "//span[.=\"October\"]")
    public WebElement october;

    @FindBy(xpath = "//span[.=\"November\"]")
    public WebElement november;

    @FindBy(xpath = "//span[.=\"December\"]")
    public WebElement december;
    //until here

    @FindBy(xpath = "//input[@class='bx-calendar-year-input']")
    public WebElement yearBox;

    //days
    @FindBy(xpath = "//a[.=\"1\"][starts-with(@class, \"bx-calendar-cell\")]")
    public WebElement one;

    @FindBy(xpath = "//a[.=\"2\"][starts-with(@class, \"bx-calendar-cell\")]")
    public WebElement two;

    //until here

    @FindBy(xpath = "//input[@title='Hours']")
    public WebElement hour1;

    @FindBy(xpath = "(//input[@title='Hours'])[2]")
    public WebElement hour2;

    @FindBy(xpath = "//input[@title='Minutes']")
    public WebElement minutes1;

    @FindBy(xpath = "(//input[@title='Minutes'])[2]")
    public WebElement minutes2;

    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setTime1;

    @FindBy(xpath = "(//input[@value='Set Time'])[2]")
    public WebElement setTime2;

    @FindBy(id = "event-remindercal_3Jcl")
    public WebElement setReminderButton;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public WebElement reminderTime;

    @FindBy(id = "event-remind_typecal_3Jcl")
    public WebElement reminderMeasurement;

    @FindBy(id = "event-locationcal_3Jcl")
    public WebElement eventLocation;

    @FindBy(id = "bxecmr_2")
    public WebElement westMeetingRoom;

    @FindBy(id = "feed-event-dest-add-link")
    public WebElement addSomeone;

    @FindBy(xpath = "//div[.=\"To all employees\"]")
    public WebElement everyone;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeButton;

    @FindBy(xpath = "//span[.=\"To all employees\"][@class='feed-event-destination-text']")
    public WebElement everyoneInMembers;

    @FindBy(id = "event-accessibilitycal_3Jcl")
    public WebElement avaliability;

    @FindBy(id = "event-repeatcal_3Jcl")
    public WebElement repeat;

    @FindBy(id = "event-sectioncal_3Jcl")
    public WebElement calendar;

    @FindBy(id = "event-importancecal_3Jcl")
    public WebElement importance;

    @FindBy(xpath = "//span[.=\"More\"][@class='feed-event-more-link-text']")
    public WebElement more;

    @FindBy(id = "cal_3Jcl_edit_ed_rep_count")
    public WebElement repeatDay;

    @FindBy(id = "cal_3Jclevent-endson-count")
    public WebElement after;

    @FindBy(id = "cal_3Jclevent-endson-count-input")
    public WebElement day;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//span[.=\"Send message …\"]")
    public WebElement event;


}
