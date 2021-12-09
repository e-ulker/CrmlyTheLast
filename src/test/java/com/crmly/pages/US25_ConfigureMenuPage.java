package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US25_ConfigureMenuPage extends BasePage{

    @FindBy(css = "#left-menu-settings")
    public WebElement configMenu;

    @FindBy(css = "#popup-window-content-menu-popup-leftMenuSettingsPopup")
    public WebElement contentPopUpMenu;

    @FindBy(css = ".menu-popup-item.menu-popup-no-icon ")
    public List<WebElement> configMenuOpt;

    @FindBy(xpath = "//span[.='Add custom menu item']") //span[.='Add custom menu item']  #menu-self-item-popup
    public WebElement addCustPopUp;

    @FindBy(css = "#menuOpenInNewPage")
    public WebElement addCustcheckBox;

    @FindBy(name = "menuPageToFavoriteName")
    public WebElement nameInput;

    @FindBy(name = "menuPageToFavoriteLink")
    public  WebElement linkInput;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addBtn;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelBtn;

    @FindBy(css = ".left-menu-confirm-popup")
    public WebElement errorText;

    @FindBy(css = ".menu-form-input.menu-form-input-error")
    public WebElement errorColorName;

    @FindBy(css = "menu-form-input menu-form-input-error")
    public WebElement errorColorLink;

    @FindBy(xpath = "//li[@class='menu-item-block' and @data-type='self']/span") // .menu-fav-editable-btn.menu-favorites-btn.menu-fav-editable-btn-js.menu-fav-editable-btn-showed
    public WebElement penSign;

    @FindBy(css = ".menu-popup-item-text")
    public List<WebElement> menuItems;

    @FindBy(xpath = "//span[.='Edit custom menu item']")
    public WebElement EditCusMenuItem;

    @FindBy(css = "#menu-self-item-popup")
    public WebElement EditWindow;

    @FindBy(css = "#left-menu-more-btn")
    public WebElement more;

    @FindBy(css = "#left-menu-hidden-items-block")
    public WebElement hiddenWindow;

    @FindBy(xpath = "//ul[@id='left-menu-hidden-items-list']//li[@class='menu-item-block']//a//span[@class='menu-item-link-text']")
    public List<WebElement> hiddenItems;

    @FindBy(xpath = "//li[@class='menu-item-block' and @data-type='self']/span")
    public WebElement penSignHidden;

    @FindBy(css = "#left-menu-delete-self-item")
    public WebElement deleteWindow;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement delete_Btn;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancel_Btn;

    @FindBy(css = ".menu-item-link-text")
    public List<WebElement> allMenuItems;

}
