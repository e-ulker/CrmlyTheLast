package com.crmly.step_definitions;

import com.crmly.pages.FilterAndSearchPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FilterAndSearchStepDefs {

    FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();

    @When("the user on the Filter and Search button")
    public void theUserOnTheFilterAndSearchButton() {
        filterAndSearchPage.filterButton.click();

    }
    @Then("Verify that the user should be able to see default filters")
    public void verifyThatTheUserShouldBeAbleToSeeDefaultFilters(List<String> expectedFilterList) {
        BrowserUtils.waitFor(2);
        List<String> actualFilterList = new ArrayList<>();
        List<WebElement> allfilters = Driver.get().findElements(By.cssSelector("[class='main-ui-filter-sidebar-item'"));
        for (WebElement filter : allfilters) {
            String filter1 = filter.getText();
            System.out.println("filter = " + filter1);
          actualFilterList.add(filter1);
        }
        Assert.assertEquals(expectedFilterList,actualFilterList);

    }

    @Then("the user enter add field")
    public void the_user_enter_add_field() {
        BrowserUtils.waitFor(2);
        filterAndSearchPage.Added.click();
    }

    @Then("the user should see seven item")
    public void the_user_should_see_seven_item(List<String> expected) {
        BrowserUtils.waitFor(2);
        List<String> actualKeyList = new ArrayList<>();
        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//div[@class='main-ui-select-inner-label']"));
        for (WebElement key : allKeys) {
            String key1 = key.getText();
            System.out.println("key = " + key1);
            actualKeyList.add(key1);
        }
        Assert.assertEquals(expected,actualKeyList);

    }

    @Then("the user add and remove")
    public void the_user_add_and_remove() {
        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//div[@class='main-ui-select-inner-label']"));
        for (WebElement key : allKeys) {
            Boolean key1 = key.isSelected();
            System.out.println("key = " + key1);
        }
    }

    @Then("the user enter date")
    public void the_user_enter_date() {
        BrowserUtils.waitFor(3);
        filterAndSearchPage.date.click();
    }

    @Then("the user should see fourteen item")
    public void the_user_should_see_item(List<String> expectedkey) {

        BrowserUtils.waitFor(2);
        List<String> actualKeyList = new ArrayList<>();
        WebElement element = Driver.get().findElement(By.xpath("(//div[@data-items])[1]"));
        String attribute = element.getAttribute("data-items");
        for (int i = 0; i < expectedkey.size(); i++) {
            Assert.assertTrue("is not contain",attribute.contains(expectedkey.get(i)));
        }

    }

    @Then("the user select anyone")
    public void the_user_select_anyone() {
        filterAndSearchPage.anyday.click();

    }

    @Then("the user click search")
    public void the_user_click_search() {
        filterAndSearchPage.search.click();

    }

    @Then("the user should see four fields")
    public void the_user_should_see_four_fields(List<String> expected) {
        BrowserUtils.waitFor(2);
        List<String> actualKeyList = new ArrayList<>();
        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//span[@class='main-ui-control-field-label']"));
        for (WebElement key : allKeys) {
            String key1 = key.getText();
            System.out.println("key = " + key1);
            actualKeyList.add(key1);
        }
        BrowserUtils.waitFor(2);
        Assert.assertEquals(expected,actualKeyList);
        BrowserUtils.waitFor(2);
    }

    @Then("the user enter add any field")
    public void the_user_enter_add_any_field() {
        filterAndSearchPage.addfields.click();
        BrowserUtils.waitFor(2);
        filterAndSearchPage.favorite.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user click restore default fields")
    public void the_user_click_restore_default_fields() {
        BrowserUtils.waitFor(2);
        filterAndSearchPage.restoredefault.click();
        BrowserUtils.waitFor(2);

    }


}

