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

    @FindBy(xpath = "//*[@id=\"top_menu_id_marketplace_more_button\"]/a/span[2]")
    public WebElement moreBtn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_marketplace_menu_marketplace\"]/a/span[2]/span[2]")
    public WebElement marketplace;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-main_buttons_popup_top_menu_id_marketplace\"]/div/div/span[5]/span[2]")
    public WebElement configureMenuTop;

    @FindBy(xpath = "//*[@id=\"top_menu_id_marketplace_menu_marketplace_hook\"]/a/span[2]/span[1]")
    public WebElement webhooksEditBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-main_buttons_popup_top_menu_id_marketplace\"]/div/div/a[3]/span[2]/span[1]/span[1]")
    public WebElement webhooksEditBtnForShow;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-top_menu_id_marketplace_edit_item\"]/div/div/span[2]/span[2]")
    public WebElement webhooksHideBtn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_marketplace_menu_marketplace_hook\"]/a/span[2]/span[2]")
    public WebElement webhooks;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-top_menu_id_marketplace_edit_item\"]/div/div/span[2]/span[2]")
    public WebElement webhooksShowBtn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_marketplace_menu_marketplace\"]/a/span[2]/span[1]")
    public WebElement itemEditForMarketplace;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-top_menu_id_marketplace_edit_item\"]/div/div/span[3]/span[2]")
    public WebElement addToLeftMenu;

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_marketplace\"]/a/span")
    public WebElement leftMenuMarketplace;

    @FindBy(xpath = "//*[@id=\"left-menu-settings\"]")
    public WebElement bottomConfigureMenu;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-leftMenuSettingsPopup\"]/div/div/span[1]/span[2]")
    public WebElement bottomConfigureMenuItems;

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_marketplace\"]/span[1]")
    public WebElement editIconForMarketPlace;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-popup_menu_marketplace\"]/div/div/span[4]/span[2]")
    public WebElement removeFromMenu;

    @FindBy(xpath = "//span[@class=\"menu-item-link-text\"]")
    public List<WebElement> contentMenuItems;

    @FindBy(xpath = "//span[@class=\"main-buttons-item-text-title\"]")
    public List<WebElement> menuItems;


    @FindBy(xpath = "//*[@id=\"top_menu_id_marketplace_menu_marketplace_installed\"]/a/span[2]/span[1]")
    public WebElement editInstalled;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-top_menu_id_marketplace_edit_item\"]/div/div/span[1]/span[2]")
    public WebElement setAsSectionHomePage;



    public void resetTopMenu(String featureName){
        WebElement featureElement = Driver.get().findElement(By.xpath("//div[text()='"+featureName+"']"));
        featureElement.click();
    }





    public void clickFeatureLink(String featureName){
        WebElement featureElement = Driver.get().findElement(By.xpath("//div[text()='"+featureName+"']"));
        featureElement.click();
    }


    public void clickTitleLink(String titleName){
        WebElement titleElement = Driver.get().findElement(By.xpath("//span[text()='"+titleName+"']"));
        titleElement.click();
    }
}
