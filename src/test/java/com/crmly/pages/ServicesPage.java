package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServicesPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Services')]")
    public WebElement services;

    @FindBy(xpath = "//span[text()='Ideas']")
    public WebElement ideas;

    @FindBy(linkText = "New idea")
    public WebElement newidea;

    @FindBy(name = "POST_TITLE")
    public  WebElement title;

    @FindBy(className = "bx-editor-iframe")
    public WebElement textFrame;

    @FindBy(xpath = "/html/body")
    public  WebElement text;

    @FindBy(xpath = "//a/span[text()='Suggest New Idea!']")
    public  WebElement submitIdea;


    @FindBy(className = "blog-post-text")
    public  WebElement veriftText;

    @FindBy(xpath = "(//*[@class='idea-rating-block-content idea-rating-block-content-ext-standart'][1]/span/a[1])[1]")
    public WebElement plusIcon;

    @FindBy(xpath = "(//*[@class='idea-rating-block-content idea-rating-block-content-ext-standart'][1]/span/a[2])[1]")
    public WebElement minusIcon;

    @FindBy(xpath = "//*[@class='idea-sort-by-link']/a[text()='rating']")
    public WebElement rating;

    @FindBy(xpath = "//*[@class='idea-sort-by-link']/a[text()='date added']")
    public WebElement date;

    @FindBy(xpath = "//*[@class='rating-vote ']/span")
    public List<WebElement> ratingNums;

    @FindBy(className = "idea-owner")
    public  List<WebElement> dateElm;

    @FindBy(linkText = "New category")
    public WebElement newCategory;

    @FindBy(id = "NAME")
    public  WebElement id;

    @FindBy(id= "savebtn")
    public WebElement savebtn;

    @FindBy(className = "bx-idea-left-menu-li")
    public List<WebElement> rightMenuItems;

    @FindBy(xpath = "//span[text()='Print']")
    public WebElement print;
}