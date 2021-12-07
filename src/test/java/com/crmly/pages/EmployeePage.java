package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

    public void selectDepartment() {
        Select selectDep = new Select(selectDept);
        List<WebElement> selectDepOptions = selectDep.getOptions();
        Random randOptions = new Random();
        for (int i = 0; i < selectDepOptions.size(); i++) {
            int numOfDept = randOptions.nextInt(selectDepOptions.size());
            selectDepOptions.get(numOfDept).click();
        }
    }
}
