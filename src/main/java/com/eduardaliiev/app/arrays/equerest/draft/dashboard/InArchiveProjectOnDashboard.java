package com.eduardaliiev.app.arrays.equerest.draft.dashboard;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eduard Aliiev on 9/17/16;
 */
public class InArchiveProjectOnDashboard {
    FirefoxDriver driver;
    String baseUrl = "https://dev.equerest.com/";
    //ввод данных пользователя, вспомогательные данные
    private final static String LOGIN = "olegftzi@gmail.com";
    private final static String PASSWORD = "Oleg1234";
    //входим в аккаунд
    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By loginButton = By.cssSelector("#submit-block > .button.button-blue");
    //в разделе "Проекты" -> "Модерация" ищем проект
    private final By projectsMenuItem = By.xpath("//*[@id='js-navbar-collapse']//*[text()='Проекты']");
    private final By projectFilterModerationButton = By.xpath("//*[@class='projects-list container ng-isolate-scope']//div[1]//*[text()='Модерация']");
    private final By projectSearchField = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[2]/div[1]/div[2]/label/../*[@id='searchModerate']");
    //добавление проекта в "В архив"
    private final By projectInArchiveButton = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]//*[text()[contains(.,'В архив')]]");

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(baseUrl + "register#/");
    }

    @Test
    public void editAndSaveStandardProjectField() {
        //входим в аккаунд
        driver.findElement(emailField).sendKeys(LOGIN);
        driver.findElement(passwordField).sendKeys(PASSWORD);
        driver.findElement(loginButton).click();
        //в разделе "Проекты" -> "Модерация" ищем проект
        driver.findElement(projectsMenuItem).click();
        driver.findElement(projectFilterModerationButton).click();
        driver.findElement(projectSearchField).sendKeys("Интернет киоски \"Инетик\".");
        //добавление проекта в "В архив"
        driver.findElement(projectInArchiveButton).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

