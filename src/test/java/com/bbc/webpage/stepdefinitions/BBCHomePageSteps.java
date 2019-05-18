package com.bbc.webpage.stepdefinitions;

import com.bbc.webpage.generic.WebDriverCommon;
import com.bbc.webpage.generic.WebDriverInst;
import com.bbc.webpage.pages.BBCHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BBCHomePageSteps {
    WebDriver stepDriver= WebDriverInst.driver;
    BBCHomePage home= PageFactory.initElements(stepDriver,BBCHomePage.class);
    @Given("^User launches the BBC Website$")
    public void user_launches_the_BBC_Website() {
        stepDriver.get("https://www.bbc.co.uk/");
        WebDriverCommon.implicitwaitMtd(stepDriver);
    }
    @When("^The WebPage has been loaded compeletly$")
    public void the_WebPage_has_been_loaded_compeletly()  {
        Assert.assertEquals(stepDriver.getTitle(),"BBC - Home");
    }

    @Then("^Verify whether all Main Menu links are not broken and is navigated to corresponding page or subsection$")
    public void verify_whether_all_Menu_links_are_not_broken_and_is_navigated_to_corresponding_page()  {
        home.clickSignInLink();
        Assert.assertTrue(stepDriver.getTitle().contains("Sign in"));
        stepDriver.navigate().back();
        home.clickAlertIcon();
        Assert.assertEquals(home.getRegisterLink().get(1).getText().trim(),"Register");
        home.clickNewsLink();
        Assert.assertTrue(stepDriver.getTitle().contains("BBC News"));
        home.clickBbcHomeLink();
        home.clickSportLink();
        Assert.assertTrue(stepDriver.getTitle().contains("BBC Sport"));
        home.clickBbcHomeLink();
        home.clickWeatherLink();
        Assert.assertTrue(stepDriver.getTitle().contains("BBC Weather"));
        home.clickBbcHomeLink();
        home.clickiPlayerLink();
        Assert.assertEquals(stepDriver.getTitle(),"BBC iPlayer");
        home.clickBbcHomeLink();
        home.clickSoundsLink();
        Assert.assertTrue(stepDriver.getTitle().contains("BBC Sounds"));
        home.clickBbcHomeLink();
        home.clickMoreOptionsLink();
        Assert.assertTrue(home.getcCBCLink().isDisplayed());
    }
    @When("^User have clicked on More Link$")
    public void user_have_clicked_on_More_Link() {
        home.clickMoreOptionsLink();
        Assert.assertTrue(home.getcCBCLink().isDisplayed());
    }

    @Then("^Verify whether sub Menu links displayed are not broken$")
    public void verify_whether_sub_Menu_links_displayed_are_not_broken()  {
        home.getcCBCLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("CBBC"));
        home.clickBbcHomeLink();
        home.clickMoreOptionsLink();
        home.getcBeebiesLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("CBeebies"));
        home.clickBbcHomeLink();
        home.clickMoreOptionsLink();
        home.getFoodLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("Food"));
        home.clickBbcHomeLink();
        home.clickMoreOptionsLink();
        home.getBiteSizeLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("Bitesize"));
        home.clickBbcHomeLink();
        home.clickMoreOptionsLink();
        home.getArtsLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("Arts"));
        home.clickBbcHomeLink();
        home.clickMoreOptionsLink();
        home.getTasterLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("Taster"));
        home.clickBbcHomeLink();
        home.clickMoreOptionsLink();
        home.getLocalLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("News"));
        stepDriver.navigate().back();
        home.clickMoreOptionsLink();
        home.getTvLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("BBC iPlayer"));
        stepDriver.navigate().back();
        home.clickMoreOptionsLink();
        home.getRadioLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("BBC Sounds"));
        home.clickBbcHomeLink();
        home.clickMoreOptionsLink();
        home.getThreeLink().click();
        Assert.assertTrue(stepDriver.getTitle().contains("BBC Three"));
    }
}
