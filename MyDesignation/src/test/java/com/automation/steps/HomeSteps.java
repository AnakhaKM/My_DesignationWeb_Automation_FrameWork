package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens website")
    public void user_opens_website() {
        homePage.openWebsite();
    }

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        ReportManager.log("Home page");
        ReportManager.attachScreenshot();
        Assert.assertTrue(homePage.verifyUserIsOnHomePage());
    }

    @When("user clicks on menu bar")
    public void user_clicks_on_menu_bar() {
        homePage.clicksOnMenuBar();
    }

    @When("user choose on kids option")
    public void user_choose_on_kids_option() {
        homePage.kidsOption();
    }

}
