package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class REM945_CompanyPage_Salih extends BasePage {
//pre-condition
    @FindBy(xpath = "//*[@id='bx_left_menu_menu_about_sect']/a/span")
    public WebElement company;

    @FindBy(xpath = "//a/span[contains(text(),'Add News')]")
    public WebElement addNewsButton;

    @FindBy(xpath = "//*[@id='tr_PREVIEW_TEXT_LABEL']/td")
    public WebElement getPreviewTextTab;

//Type of information
    @FindBy(xpath = "//select[@name='PROP[3][]']")
    public WebElement typeOfInfoDropdawn;

    @FindBy(id = "tab_cont_cedit2")
    public WebElement detailsTab;

    @FindBy(xpath = "//*[@id='tr_DETAIL_TEXT_LABEL']/td")
    public WebElement getDetailsTab;

    @FindBy(id = "tab_cont_cedit1")
    public WebElement previewTextTab;

    @FindBy(name = "ACTIVE_FROM")
    public WebElement dateInputBox;

    @FindBy(xpath = "//span[@class='adm-calendar-icon']")
    public WebElement selectDateIcon;

    @FindBy(xpath = "(//*[@class='bx-calendar-button-text'])[1]")
    public WebElement select;

    @FindBy(xpath = "(//div//a[@class='bx-calendar-cell bx-calendar-weekend' or @class='bx-calendar-cell' or @class='bx-calendar-cell bx-calendar-weekend bx-calendar-active' or @class='bx-calendar-cell bx-calendar-active'])[1]")
    public WebElement days;

    @FindBy(className = "bx-calendar-top-month")
    public WebElement month;

    @FindBy(xpath = "(//div//span[@class='bx-calendar-month' or @class='bx-calendar-month bx-calendar-month-active' ])[]")
    public WebElement months;

    @FindBy(className = "bx-calendar-top-year")
    public WebElement yearDropDawn;

    @FindBy(xpath = "//div//span[@class='bx-calendar-year-number bx-calendar-year-active' or @class='bx-calendar-year-number'][]")
    public WebElement years;

    @FindBy(className = "bx-calendar-set-time")
    public WebElement setTimeIcon;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[1]")
    public WebElement hourInput;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[2]")
    public WebElement minuteInput;

    @FindBy(className = "bx-calendar-AM-PM-text")
    public WebElement amPm;

    @FindBy(linkText = "Select")
    public WebElement select2;

    @FindBy(id = "bx_file_detail_picture_add")
    public WebElement DragDrop2;

    @FindBy(id = "//div[@id='bx-admin-prefix'][2]//input")
    public WebElement DragDrop3;


    @FindBy(id = "bx_file_detail_picture_input")
    public WebElement DragDrop;

//    @FindBy(xpath = "//span[@class='adm-fileinput-drag-area-hint']")
//    public WebElement DragDrop;

    public void actualDay(String dayPattern) {

        DateFormat toFormat = new SimpleDateFormat(dayPattern);

        Date actualDate = new Date();

        String checkDay = toFormat.format(actualDate);

        System.out.println(checkDay);

        WebElement actualDay = Driver.get().findElement(By.xpath("(//div//a[@class='bx-calendar-cell bx-calendar-active bx-calendar-weekend' or @class='bx-calendar-cell bx-calendar-active'])"));
        //WebElement actualDat = Driver.get().findElement(By.xpath("//div//a[@class='bx-calendar-cell' or @class='bx-calendar-cell bx-calendar-weekend' or @class='bx-calendar-cell bx-calendar-active bx-calendar-weekend']"))

        System.out.println("checkDay = " + checkDay);
        System.out.println(actualDay.getText());

        Assert.assertEquals("is not selected", checkDay, actualDay.getText());

    }

    public void actualMonth(String monthPattern) {


        DateFormat toFormat = new SimpleDateFormat(monthPattern);

        Date actualDate = new Date();

        String checkMonth = toFormat.format(actualDate);

        String[] months = {"January", "February", "March", "April", "May", "June", "June", "August", "September", "October", "November", "December"};
        int i = Integer.parseInt(checkMonth);
        checkMonth = months[i - 1];
        System.out.println(checkMonth);

        WebElement actualMonth = Driver.get().findElement(By.className("bx-calendar-top-month"));

        System.out.println("actualMonth = " + actualMonth.getText());

        Assert.assertEquals("is not selected", checkMonth, actualMonth.getText());

    }

    public void actualYear(String yearPattern) {


        DateFormat toFormat = new SimpleDateFormat(yearPattern);

        Date actualDate = new Date();

        String checkYear = toFormat.format(actualDate);

        System.out.println("checkYear = " + checkYear);

        WebElement actualYear = Driver.get().findElement(By.className("bx-calendar-top-year"));

        System.out.println("actualYear = " + actualYear.getText());

        Assert.assertEquals("is not selected", checkYear, actualYear.getText());

    }

    public void chooseMonth(String sendMonth) {
        int toLocate;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            if (sendMonth.equals(months[i])) {
                toLocate = i + 1;
                System.out.println("toLocate = " + toLocate);
                WebElement clickMonth = Driver.get().findElement(By.xpath("(//div//span[@class='bx-calendar-month' or @class='bx-calendar-month bx-calendar-month-active' ])[" + toLocate + "]"));
                clickMonth.click();
                Assert.assertEquals("no match", month.getText(), sendMonth);
                month.click();
            } else {

            }
        }
    }

    public void selectYear(String sendYear) {
        int toLocate;
        String[] years = {"2024", "2023", "2022", "2021", "2020", "2019", "2018"};

        for (int i = 0; i < years.length; i++) {
            if (sendYear.equals(years[i])) {
                toLocate = i + 1;
                System.out.println("toLocate = " + toLocate);
                WebElement clickYear = Driver.get().findElement(By.xpath("//div//span[@class='bx-calendar-year-number bx-calendar-year-active' or @class='bx-calendar-year-number'][" + toLocate + "]"));
                clickYear.click();
                Assert.assertEquals("no match", yearDropDawn.getText(), sendYear);
                yearDropDawn.click();
            } else {

            }
        }

    }

    public void chooseDay() {
        Random dayOfCalendar = new Random();
        int upperBound = 32;
        int chooseDay = dayOfCalendar.nextInt(upperBound);

        WebElement choosedDay = Driver.get().findElement(By.xpath("(//div//a[@class='bx-calendar-cell bx-calendar-weekend' or @class='bx-calendar-cell' or @class='bx-calendar-cell bx-calendar-weekend bx-calendar-active' or @class='bx-calendar-cell bx-calendar-active'])[" + chooseDay + "]"));
        choosedDay.click();

    }

    public void setHour() {
        Random dayOfCalendar = new Random();
        int upperBound = 13;
        int chooseDay = dayOfCalendar.nextInt(upperBound);
        String choosedDay = String.valueOf(chooseDay);


        WebElement chooseHourBox = Driver.get().findElement(By.xpath("(//input[@class='bx-calendar-form-input'])[1]"));
        chooseHourBox.click();
        chooseHourBox.sendKeys(choosedDay);
    }

    public void setMinute() {
        Random dayOfCalendar = new Random();
        int upperBound = 60;
        int chooseMinute = dayOfCalendar.nextInt(upperBound);
        String choosedMinute = String.valueOf(chooseMinute);

        WebElement chooseMinuteBox = Driver.get().findElement(By.xpath("(//input[@class='bx-calendar-form-input'])[2]"));
        chooseMinuteBox.click();
        chooseMinuteBox.sendKeys(choosedMinute);
    }
    public void setAmPm(){
        String actualDayPart = amPm.getText();
        amPm.click();
        if (!(amPm.getText().equals(actualDayPart))){
            System.out.println("PASS");
            System.out.println(actualDayPart);
            System.out.println(amPm.getText());
        }else{System.out.println("FAIL");
            System.out.println(actualDayPart);
            System.out.println(amPm.getText());

        }
    }
    public void setClipboardData(String string) {
        //StringSelection is a class that can be used for copy and paste operations.

        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

    }
    public void uploadFile(String fileLocation) {
        try {
            //Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}




