package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_938TaskPage extends BasePage{
    public US_938TaskPage() {
        PageFactory.initElements(Driver.get(), this);}


    @FindBy(css = "#tasks-buttonAdd")
    public WebElement newTask;

    @FindBy(className = "side-panel-iframe")
    public WebElement iframe;

    @FindBy(xpath = "//div//input[@data-bx-id='task-edit-priority-cb']")
    public WebElement checkbox;

    @FindBy(id = "lhe_button_editor_task-form-bitrix_tasks_task_default_1")
    public WebElement visualEditor;

    @FindBy(xpath= "//div[@class='bxhtmled-toolbar']")
    public WebElement textbar;

    @FindBy(xpath= "//span[@class='tasks-task-mpf-link']")
    public WebElement checklist;

    @FindBy(css= "input[class='js-id-checklist-is-form-title task-checklist-field-add']")
    public WebElement thingsToDoBox;

    @FindBy(xpath= "//*[contains(text(),'Testcase')]")
    public WebElement checklistitem;

    @FindBy(css= "span[class='js-id-checklist-is-add-separator task-dashed-link-inner']")
    public WebElement separatorbutton;

    @FindBy(xpath= "//span[.='separator']")
    public WebElement separator;

    @FindBy(xpath= "//button[@data-bx-id='task-edit-submit'][1]")
    public WebElement sendtask;

    @FindBy(xpath= "//input[@data-bx-id='task-edit-title']")
    public WebElement title;

    @FindBy(xpath= "//body[@contenteditable='true']")
    public WebElement content;

    @FindBy(xpath= "//*[contains(text(),'Jenkins')]")
    public WebElement AddedTask;

    @FindBy(css= ".tasks-checklist-item-marker")
    public WebElement separatorline;

    @FindBy(css= "span[class='js-id-checklist-is-form-submit block-edit tasks-btn-apply task-field-title-ok']")
    public WebElement checkSign;

    @FindBy(css= "input[class='js-id-checklist-is-i-toggle task-checklist-field-checkbox']")
    public WebElement deleteChecklist;

}
