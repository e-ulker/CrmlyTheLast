package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AnnouncementPage {

    public AnnouncementPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "span#feed-add-post-form-link-text")
    public WebElement More;

    @FindBy(xpath = "//div[@class='menu-popup-items']//span[text()='Announcement']")
    public WebElement Announcement;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement DeleteAllContactButton;

    @FindBy(name = "bxu_files[]")
    public WebElement UploadFilesAndImages;

    @FindBy(xpath= "//div[@id='post-buttons-bottom']//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement UploadFile;

    @FindBy(xpath = "//td[@class='files-del-btn']/span[@class='del-but']")
    public WebElement delButton;

    @FindBy(xpath = "//ol[@class='feed-add-post-strings-blocks']//a[@id='bx-destination-tag']")
    public WebElement AddMore;

    @FindBy(linkText = "Employees and departments")
    public WebElement EmployeesAndDepartments;

    @FindBy(xpath = "//ol[@class='feed-add-post-strings-blocks']//span[@class='feed-add-post-destination-text']")
    public List<WebElement> contactNames;

    @FindBy(xpath = "//form[@id='blogPostForm']//input[@id='feed-add-post-destination-input']")
    public WebElement ContactInputbox;

    @FindBy(xpath = "(//div[@id='microblog-form']//a[@class='feed-add-destination-link'])[1]")
    public WebElement AddPerson;

    @FindBy(css = "button#blog-submit-button-save")
    public WebElement SendButton;




}
