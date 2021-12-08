package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CompanyPage_REM945_slh extends BasePage {
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


}



