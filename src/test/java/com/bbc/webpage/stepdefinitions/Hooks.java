package com.bbc.webpage.stepdefinitions;

import com.bbc.webpage.generic.WebDriverInst;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    public WebDriverInst webInst;
    @Before
    public void intializeBrowser()
    {
        webInst= WebDriverInst.getInstance();
        webInst.driver.manage().window().maximize();
    }
    @After
    public void closeBrowser()
    {
        webInst.driver.quit();
        webInst.driver= null;
    }
}
