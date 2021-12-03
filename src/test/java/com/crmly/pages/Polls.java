package com.crmly.pages;

import com.crmly.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Polls {

    public Polls() {
        PageFactory.initElements(Driver.get(), this);
    }



    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-vote\"]/span")
    public WebElement polltab;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
    public WebElement linkbtn;

    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-text\"]")
    public WebElement linktxtbtn;

    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement linkURLbtn;

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement savebtn;

    @FindBy(xpath = "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement mntnbtn;


}
