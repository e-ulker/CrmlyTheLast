package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePage extends BasePage{

    @FindBy(css = "a[title='Employees'] span[class='menu-item-link-text']")
    public WebElement employeeBtn;

    @FindBy(css = "span[id='pagetitle']")
    public WebElement compStrSubtitle;
}
