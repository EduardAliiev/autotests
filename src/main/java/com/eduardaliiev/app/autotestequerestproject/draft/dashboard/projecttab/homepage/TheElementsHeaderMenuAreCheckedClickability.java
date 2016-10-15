package com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.homepage;

import org.junit.After;
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
        //clickability equerestLogo
        driver.findElement(missionButton).click();
        driver.findElement(equerestLogo).click();

        driver.findElement(entrepreneurButton).click();
        driver.findElement(equerestLogo).click();

        driver.findElement(investorButton).click();
        driver.findElement(equerestLogo).click();

        driver.findElement(projectsButton).click();
        driver.findElement(equerestLogo).click();

        driver.findElement(enterButton).click();
        driver.findElement(equerestLogo).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
