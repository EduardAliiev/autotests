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
public class HomeMenu {
    FirefoxDriver driver;
    String baseUrl = "https://dev.equerest.com/";
    //The Elements "Header" Menu
    private final By equerestLogo = By.xpath("/html/body/div[1]/header/div/nav/div[1]/div[1]//img[contains(@src, 'header_logo.svg')]");
    private final By missionButton = By.xpath("/html/body/div[1]/header//*[text()[contains(.,'Миссия')]]");
    private final By entrepreneurButton =By.xpath("/html/body/div[1]/header//*[text()[contains(.,'Предпринимателю')]]");
    private final By investorButton =By.xpath("/html/body/div[1]/header//*[text()[contains(.,'Инвестору')]]");
    private final By projectsButton =By.xpath("/html/body/div[1]/header//*[text()[contains(.,'Проекты')]]");
    private final By enterButton =By.xpath("/html/body/div[1]/header//*[text()[contains(.,'Войти')]]");
    //private final By successfulProjects = By.xpath("//*[@id='complete']//*[text()[contains(.,'Успешные проекты')]]");
    private final By moreSuccessfulProjectsButton = By.xpath("//*[@id='complete']//*[text()[contains(.,'Больше успешных проектов')]]");
    private final By missionEquerestButton = By.xpath("//*[@id='main']//*[text()[contains(.,'Миссия Equerest')]]");
    private final By moreNewProjectsButton = By.xpath("//*[@id='new_projects']//*[text()[contains(.,'Больше новых проектов')]]");

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(baseUrl);
    }

    @Test
    public void clickabilityElementsHeaderMenu() {
        //clickability 'Mission' button
        driver.findElement(missionButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='mission']//h1[text()[contains(.,'Миссия Equerest')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());


        //clickability 'Entrepreneur' button
        driver.findElement(entrepreneurButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='banner']//h1[text()[contains(.,'Найдем инвестора для вашего бизнеса')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());


        //clickability 'Investor' button
        driver.findElement(investorButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='banner']//h1[text()[contains(.,'Инвестируйте в перспективные проекты')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());


        //clickability 'Projects' button
        driver.findElement(projectsButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='catalog']//h1[text()[contains(.,'Проекты')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());


        //clickability 'Enter' button
        driver.findElement(enterButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='login-block']//h3[text()[contains(.,'Войти')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());


        //Успешные проекты
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='complete']//*[text()[contains(.,'Успешные проекты')]]")).isEnabled());
        driver.findElement(moreSuccessfulProjectsButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='catalog']//h1[text()[contains(.,'Проекты')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());

        //Миссия Equerest
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='main']//*[text()[contains(.,'Мы убеждены, что за бизнесом должно стоять желание помогать людям')]]")).isEnabled());
        driver.findElement(missionEquerestButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='mission']//h1[text()[contains(.,'Миссия Equerest')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());


        //Новые проекты
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='new_projects']//*[text()[contains(.,'Новые проекты')]]")).isEnabled());
        driver.findElement(moreNewProjectsButton).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='catalog']//h1[text()[contains(.,'Проекты')]]")).isEnabled());
        driver.findElement(equerestLogo).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#banner .h1[class='h1']")).isEnabled());

    }
    @After
    public void tearDown() {
        driver.quit();
    }

}
