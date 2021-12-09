package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterAndSearchPage extends BasePage{

    @FindBy(css = "[class='main-ui-filter-search-filter']")
    public WebElement filterButton;

    @FindBy (xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement Added;

    @FindBy(xpath = "//div[@class='main-ui-control main-ui-select']")
    public WebElement date;
    @FindBy(xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button  main-ui-filter-find']")
    public WebElement search;
    @FindBy(xpath = "//span[@class='main-ui-select-name']")
    public WebElement anyday;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addfields;

    @FindBy(xpath = "//div[@class='main-ui-filter-field-list-item main-ui-select-inner-item'][1]")
    public WebElement favorite;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoredefault;

    @FindBy(css = "[class='main-ui-filter-add-item']")
    public WebElement saveFilter;

    @FindBy(css = "[class='main-ui-filter-sidebar-edit-control']")
    public WebElement filterName;

    @FindBy(css = "[class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement save;

    @FindBy(xpath = "//*[contains(text(),'Message')]")
    public WebElement verifyFilter;
}
