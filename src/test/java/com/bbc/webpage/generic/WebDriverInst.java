package com.bbc.webpage.generic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverInst {
    public static WebDriver driver =null;
    private static WebDriverInst inst= null;
    private String browserType;
    public static WebDriverInst getInstance() {
        if (inst == null || driver == null)
            inst = new WebDriverInst();
        return inst;
    }

    private WebDriverInst()
    {
        browserType = System.getProperty("browser","chrome").toLowerCase();
        switch (browserType)
        {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver= new InternetExplorerDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();
                break;
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
    }
}
