package com.bbc.webpage.pages;

import com.bbc.webpage.generic.WebDriverCommon;
import com.bbc.webpage.generic.WebDriverInst;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BBCHomePage {
    @FindBy(how= How.XPATH,using="//a[text()='Homepage']")
    private WebElement bbcHomeLink;

    @FindBy(how= How.XPATH,using="//a[@id='idcta-link']/span[@id='idcta-username']")
    private WebElement signInLink;

    @FindBy(how= How.XPATH,using="//a[@id='notification-link']")
    private WebElement alertIcon;

    @FindBy(how= How.XPATH,using="//div[@id='orb-nav-links']//a[text()='News']")
    private WebElement newsLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-nav-links']//a[text()='Sport']")
    private WebElement sportLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-nav-links']//a[text()='Weather']")
    private WebElement weatherLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-nav-links']//a[text()='iPlayer']")
    private WebElement iPlayerLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-nav-links']//a[text()='Sounds']")
    private WebElement soundsLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-nav-links']//a[text()='More']")
    private WebElement moreOptionsLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='CBBC']")
    private WebElement cCBCLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='CBeebies']")
    private WebElement cBeebiesLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='Food']")
    private WebElement foodLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='Bitesize']")
    private WebElement biteSizeLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='Arts']")
    private WebElement artsLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='Taster']")
    private WebElement tasterLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='Local']")
    private WebElement localLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='TV']")
    private WebElement tvLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='Radio']")
    private WebElement radioLink;

    @FindBy(how= How.XPATH,using="//div[@id='orb-panel-more']//a[text()='Three']")
    private WebElement threeLink;

    @FindBy(how=How.XPATH,using="//a[contains(@href,'session.bbc.co.uk/session?action=register')]")
    private List<WebElement> registerLink;

    public List<WebElement> getRegisterLink()
    {
        return registerLink;
    }

    public void clickBbcHomeLink() {
        WebDriverCommon.explicitWait(bbcHomeLink, WebDriverInst.driver);
        bbcHomeLink.click();
    }

    public void clickSignInLink() {
        WebDriverCommon.explicitWait(signInLink,WebDriverInst.driver);
        signInLink.click();
    }

    public void clickAlertIcon() {
        WebDriverCommon.explicitWait(alertIcon,WebDriverInst.driver);
        alertIcon.click();
    }

    public void clickNewsLink() {
        WebDriverCommon.explicitWait(newsLink,WebDriverInst.driver);
        newsLink.click();
    }

    public void clickSportLink() {
        WebDriverCommon.explicitWait(sportLink,WebDriverInst.driver);
        sportLink.click();
    }

    public void clickWeatherLink() {
        WebDriverCommon.explicitWait(weatherLink,WebDriverInst.driver);
        weatherLink.click();
    }

    public void clickiPlayerLink() {
        WebDriverCommon.explicitWait(iPlayerLink,WebDriverInst.driver);
        iPlayerLink.click();
    }

    public void clickSoundsLink() {
        WebDriverCommon.explicitWait(soundsLink,WebDriverInst.driver);
        soundsLink.click();
    }

    public void clickMoreOptionsLink() {
        WebDriverCommon.explicitWait(moreOptionsLink,WebDriverInst.driver);
        moreOptionsLink.click();
    }

    public WebElement getcCBCLink() {
        WebDriverCommon.explicitWait(cCBCLink,WebDriverInst.driver);
        return cCBCLink;
    }

    public WebElement getcBeebiesLink() {
        WebDriverCommon.explicitWait(cBeebiesLink,WebDriverInst.driver);
        return cBeebiesLink;
    }

    public WebElement getFoodLink() {
        WebDriverCommon.explicitWait(foodLink,WebDriverInst.driver);
        return foodLink;
    }

    public WebElement getBiteSizeLink() {
        WebDriverCommon.explicitWait(biteSizeLink,WebDriverInst.driver);
        return  biteSizeLink;
    }

    public WebElement getArtsLink() {
        WebDriverCommon.explicitWait(artsLink,WebDriverInst.driver);
        return artsLink;
    }

    public WebElement getTasterLink() {
        WebDriverCommon.explicitWait(tasterLink,WebDriverInst.driver);
        return tasterLink;
    }

    public WebElement getLocalLink() {
        WebDriverCommon.explicitWait(localLink,WebDriverInst.driver);
        return localLink;
    }

    public WebElement getTvLink() {
        WebDriverCommon.explicitWait(tvLink,WebDriverInst.driver);
        return tvLink;
    }

    public WebElement getRadioLink() {
        WebDriverCommon.explicitWait(radioLink,WebDriverInst.driver);
        return radioLink;
    }

    public WebElement getThreeLink() {
        WebDriverCommon.explicitWait(threeLink,WebDriverInst.driver);
        return threeLink;
    }
}
