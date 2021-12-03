package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterAndSearchPage extends BasePage{

    @FindBy(css = "[class='main-ui-filter-search-filter']")
    public WebElement filterButton;

}
