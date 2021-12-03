package com.crmly.step_definitions;

import com.crmly.pages.US25_ConfigureMenuPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US25_ConfigureMenuStepDefs {
    US25_ConfigureMenuPage configureMenuPage= new US25_ConfigureMenuPage();

    @When("the user clicks configure menu option")
    public void the_user_clicks_configure_menu_option() {
        configureMenuPage.configMenu.click();
    }

    @Then("menu pop up should be display")
    public void menu_pop_up_should_be_display() {
        Assert.assertTrue(configureMenuPage.contentPopUpMenu.isDisplayed());
    }


    @Then("the system should display following options inside the configuration pop up window")
    public void the_system_should_display_following_options_inside_the_configuration_pop_up_window(List<String> expectedOptions) {

        List<String> actualOptions= new ArrayList<>();

        for (WebElement option: configureMenuPage.configMenuOpt){
            actualOptions.add(option.getText());
        }

        Assert.assertEquals("verify the actual options list", expectedOptions, actualOptions);
    }



    @When("the user hits {string} option from the menu pop up")
    public void the_user_hits_option_from_the_menu_pop_up(String option) {

        String path= "//span[text()='"+option+"']";

        switch (option){
            case "Configure menu items":
                Driver.get().findElement(By.xpath(path)).click();
                break;
            case "Collapse menu":
                Driver.get().findElement(By.xpath(path)).click();
                break;
            case "Remove current page from left menu":
                Driver.get().findElement(By.xpath(path)).click();
                break;
            case "Add custom menu item":
                Driver.get().findElement(By.xpath(path)).click();
                break;
            case "Change primary tool":
                Driver.get().findElement(By.xpath(path)).click();
                break;
            case "Reset menu":
                Driver.get().findElement(By.xpath(path)).click();
                break;
            default:
                System.out.println("something went wrong clicking the configure menu option");

        }


    }

    @Then("{string} window should be display")
    public void window_should_be_display(String string) {
        Assert.assertTrue(configureMenuPage.addCustPopUp.isDisplayed());
    }

    @Then("verify {string} checkbox is selected as a default")
    public void verify_checkbox_is_selected_as_a_default(String string) {
        Assert.assertTrue(configureMenuPage.addCustcheckBox.isSelected());
    }



    @When("user adds custom menu as {string} to redirect {string}")
    public void user_adds_custom_menu_as_to_redirect(String name, String link) {

        configureMenuPage.nameInput.sendKeys(name+ Keys.ENTER);
        configureMenuPage.linkInput.sendKeys(link+Keys.ENTER);

    }

    @Then("hit the {string} button on the add custom menu window")
    public void hit_the_button_on_the_add_custom_menu_window(String button) {
        switch(button){
            case "Add":
                configureMenuPage.addBtn.click();
                break;
            case "Cancel":
                configureMenuPage.cancelBtn.click();
                break;
            default:
                System.out.println("Something wrong by using Add or Cancel button");
        }

    }

    @Then("verify {string} custom menu is displayed on the menu items")
    public void verify_custom_menu_is_displayed_on_the_menu_items(String customMenuName) {
        String customMenuPath= "//span[.='"+customMenuName+"']";
        String actualCustomMenuName= Driver.get().findElement(By.xpath(customMenuPath)).getText();
        Assert.assertEquals("verify the expected custom menu name is same with the actual", customMenuName, actualCustomMenuName);

    }
}
