package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplicationsPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"mp_category_new_free\"]/div")
    public List<WebElement> newApplications;

    @FindBy(xpath = "//*[@id=\"mp_category_new_free\"]/div[2]/div/div/div[2]/div[3]/div[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//*[@id=\"detail_cont\"]/div[1]/div[2]/div[3]/a")
    public WebElement installButton;

    @FindBy(xpath = "//*[@id=\"mp_install_confirm_popup\"]/div[2]/span[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"popup-window-content-mp-detail-block\"]")
    public WebElement popUpAlert;

    @FindBy(xpath = "//iframe[@class='side-panel-iframe']")
    public WebElement iframeElement;

    @FindBy(xpath = "//div[starts-with(@class, 'mp-detail-content-menu-item')]")
    public List<WebElement> contentMenuFeatures;

    @FindBy(xpath = "//span[starts-with(@class, 'main-buttons-item-text-title')]")
    public List<WebElement> titleMenuTexts;


    public void clickFeatureLink(String featureName){
        WebElement featureElement = Driver.get().findElement(By.xpath("//div[text()='"+featureName+"']"));
        featureElement.click();
    }


    public void clickTitleLink(String titleName){
        WebElement titleElement = Driver.get().findElement(By.xpath("//span[text()='"+titleName+"']"));
        titleElement.click();
    }
}
