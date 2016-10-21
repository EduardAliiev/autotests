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
public class PostProjectAndHowWeAreWorkingAreCheckedClickability {
    FirefoxDriver driver;
    String baseUrl = "https://dev.equerest.com/";
    //The Elements "Header" Menu
    private final By equerestLogo = By.xpath("/html/body/div[1]/header/div/nav/div[1]/div[1]//img[contains(@src, 'header_logo.svg')]");
    private final By PostProjectButton = By.xpath("//*[@id='banner']//a[text()[contains(.,'Подать проект')]]");
    private final By HowWeAreWorkingButton = By.xpath(".//*[@id='banner']//a[text()[contains(.,'Как мы работаем?')]]");



    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(baseUrl);
    }

    @Test
    public void clickabilityElementsHeaderMenu() {
        //clickability 'Post project' button
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h3[class='h3']")).isEnabled());
        driver.findElement(PostProjectButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='entrepreneur-register-form']//h1[text()[contains(.,'Регистрация вашего бизнес-проекта')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());
        //clickability 'How we are working' button
        driver.findElement(HowWeAreWorkingButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='banner']//h1[text()[contains(.,'Найдем инвестора для вашего бизнеса')]]")).isEnabled());

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
