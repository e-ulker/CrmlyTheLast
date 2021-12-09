package com.crmly.pages;

import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.Random;

public class EmployeePage extends BasePage {

    @FindBy(css = "a[title='Employees'] span[class='menu-item-link-text']")
    public WebElement employeeBtn;

    @FindBy(css = "span[id='pagetitle']")
    public WebElement compStrSubtitle;

    @FindBy(css = ".webform-small-button.webform-small-button-blue.webform-small-button-add")
    public WebElement addDepartmentBtn;

    @FindBy(css = "#NAME")
    public WebElement deptNameField;

    @FindBy(css = "#IBLOCK_SECTION_ID")
    public WebElement selectDept;

    @FindBy(css = "span[class='popup-window-button popup-window-button-accept']")
    public WebElement addBtn;

    @FindBy(css = "#pagetitle")
    public WebElement FindEmp;

    @FindBy(css = "#user-fio")
    public  WebElement searchBar;

    @FindBy(css = ".bx24-top-bar-search-icon")
    public WebElement searchButton;

    @FindBy(css = "span.filter-but-text")
    public WebElement searchByAlphabet;

    @FindBy(css = "span[class='filter-but-icon']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[normalize-space()='Export to Excel']")
    public WebElement exportButton;

    public String downloadPath = "C:\\Users\\Lumina\\Downloads";

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName))
                return flag=true;
        }
        return flag;
    }

    public void searchByLetter(String letter){
        Driver.get().findElement(By.linkText(letter)).click();
    }

    public void selectDepartment() {
        Select selectDep = new Select(selectDept);
        List<WebElement> selectDepOptions = selectDep.getOptions();
        Random randOptions = new Random();
        for (int i = 0; i < selectDepOptions.size(); i++) {
            int numOfDept = randOptions.nextInt(selectDepOptions.size());
            selectDepOptions.get(numOfDept).click();
        }
    }

    /**
     * This method will recover in case of exception after unsuccessful the click,
     * and will try to click on element again.
     *
     * @param by
     * @param attempts
     */
    public void clickWithWait(By by, int attempts) {
        int counter = 0;
        //click on element as many as you specified in attempts parameter
        while (counter < attempts) {
            try {
                //selenium must look for element again
                clickWithJS(Driver.get().findElement(by));
                //if click is successful - then break
                break;
            } catch (WebDriverException e) {
                //if click failed
                //print exception
                //print attempt
                e.printStackTrace();
                ++counter;
                //wait for 1 second, and try to click again
                waitFor(1);
            }
        }
    }

    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }

    public void navigateToTab(String tab) {
        String tabLocator = "//span[@class='main-buttons-item-text-title'][normalize-space()='"+tab+"']";
        //span[normalize-space()='Find Employee'][@class='main-buttons-item-text-title']
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }
}
