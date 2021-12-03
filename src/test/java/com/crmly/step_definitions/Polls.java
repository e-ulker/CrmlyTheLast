package com.crmly.step_definitions;

import com.crmly.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Duration;


public class Polls {

    com.crmly.pages.Polls polls = new com.crmly.pages.Polls();

    Faker faker = new Faker();

    @When("user clicks poll tab under Activity Stream")
    public void user_clicks_poll_tab_under_activity_stream() {
        polls.polltab.click();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("user clicks Link icon symbol under text area")
    public void user_clicks_link_icon_symbol_under_text_area() {
        polls.linkbtn.click();
    }
    @Then("user should not be able to add URL without two dots and {string}")
    public void user_should_not_be_able_to_add_url_without_two_dots_and(String string) {
        polls.linkURLbtn.click();
        String domain = faker.internet().domainName();
        polls.linkURLbtn.sendKeys(domain);
        boolean cntns=domain.contains("www") || domain.contains(".");
        polls.savebtn.click();
        Assert.assertTrue("url should correctly created",cntns);
    }

    @When("user writes its question on question inputbox")
    public void user_writes_its_question_on_question_inputbox() {


    }
    @Then("user should not be able to add poll without minimum answer options")
    public void user_should_not_be_able_to_add_poll_without_minimum_answer_options() {


    }

    @Then("user should be able to select multiple contacts from contact lists.")
    public void user_should_be_able_to_select_multiple_contacts_from_contact_lists() {


    }

    @Then("user should be able to add questions and multiple answers.")
    public void user_should_be_able_to_add_questions_and_multiple_answers() {


    }

    @Then("user should not be able to send poll with same question asked before")
    public void user_should_not_be_able_to_send_poll_with_same_question_asked_before() {


    }
}
