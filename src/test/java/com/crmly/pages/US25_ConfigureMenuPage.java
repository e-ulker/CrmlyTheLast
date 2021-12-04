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

    @FindBy(css = "#menu-self-item-popup")
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

    

}
