package com.bbc.webpage.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverCommon {
    public static void implicitwaitMtd(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    public static void explicitWait(WebElement elem, WebDriver driver)
    {
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(elem));
    }
}
