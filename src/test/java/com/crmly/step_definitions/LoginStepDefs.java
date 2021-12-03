package com.crmly.step_definitions;

import com.crmly.pages.LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("user should be able to login as {string} successfully")
    public void userShouldBeAbleToLoginAsSuccessfully(String userName) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String username = ConfigurationReader.get(userName+"_username");
        String password = ConfigurationReader.get("all_password");
        new LoginPage().login(username,password);
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains("Portal"));
    }
}
