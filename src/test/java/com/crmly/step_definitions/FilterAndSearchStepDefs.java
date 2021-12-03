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
}
