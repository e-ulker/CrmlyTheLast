package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_938DashboardPage extends BasePage{
    @FindBy(xpath = "//*[@title='Tasks']")
    public WebElement Tasks;
}
