package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"left-menu-more-btn\"]/span[1]")
    public WebElement moreButton;

    public void navigateActiveStream(String menuName){
        WebElement menuElement = Driver.get().findElement(By.xpath("//span[contains(text(), '"+menuName+"')]"));
        menuElement.click();
    }
}

