package com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eduard Aliiev on 10/15/16;
 */
public class TheElementsHeaderMenuAreCheckedClickability {
    FirefoxDriver driver;
    String baseUrl = "https://dev.equerest.com/";
    //The Elements "Header" Menu
    private final By equerestLogo = By.xpath("/html/body/div[1]/header/div/nav/div[1]/div[1]//img[contains(@src, 'header_logo.svg')]");
    private final By missionButton = By.xpath("/html/body/div[1]/header/div/nav/div[1]/div[2]//*[text()[contains(.,'Миссия')]]");
    private final By entrepreneurButton =By.xpath("/html/body/div[1]/header/div/nav/div[1]/div[2]//*[text()[contains(.,'Предпринимателю')]]");
    private final By investorButton =By.xpath("/html/body/div[1]/header/div/nav/div[1]/div[2]//*[text()[contains(.,'Инвестору')]]");
    private final By projectsButton =By.xpath("/html/body/div[1]/header/div/nav/div[1]/div[2]//*[text()[contains(.,'Проекты')]]");
    private final By enterButton =By.xpath("/html/body/div[1]/header/div/nav/div[2]//*[text()[contains(.,'Войти')]]");

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(baseUrl + "register#/");
    }

    @Test
    public void clickabilityElementsHeaderMenu() {
        //clickability 'Mission' button
        driver.findElement(missionButton).click();
        Assert.assertTrue(driver.findElement(missionButton).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(equerestLogo).isEnabled());


        //clickability 'Entrepreneur' button
        driver.findElement(entrepreneurButton).click();
        Assert.assertTrue(driver.findElement(entrepreneurButton).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(equerestLogo).isEnabled());


        //clickability 'Investor' button
        driver.findElement(investorButton).click();
        Assert.assertTrue(driver.findElement(investorButton).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(equerestLogo).isEnabled());


        //clickability 'Projects' button
        driver.findElement(projectsButton).click();
        Assert.assertTrue(driver.findElement(projectsButton).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(equerestLogo).isEnabled());


        //clickability 'Enter' button
        driver.findElement(enterButton).click();
        Assert.assertTrue(driver.findElement(enterButton).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(equerestLogo).isEnabled());

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
