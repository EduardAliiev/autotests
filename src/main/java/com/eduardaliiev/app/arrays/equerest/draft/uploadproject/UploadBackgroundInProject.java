package com.eduardaliiev.app.arrays.equerest.draft.uploadproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.LocalFileDetector;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eduard Aliiev on 9/18/16;
 */
public class UploadBackgroundInProject {
    FirefoxDriver driver;
    String baseUrl = "https://dev.equerest.com/";
    //ввод данных пользователя, вспомогательные данные
    private final static String LOGIN = "olegftzi@gmail.com";
    private final static String PASSWORD = "Oleg1234";
    private final static String UPLOADBACKGROUND = "src/main/java/com/eduardaliiev/app/arrays/equerest/resources/background.jpg";
    //входим в аккаунд
    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By loginButton = By.cssSelector("#submit-block > .button.button-blue");
    //в разделе "Проекты" -> "Модерация" ищем проект
    private final By projectsMenuItem = By.xpath("//*[@id='js-navbar-collapse']//*[text()='Проекты']");
    private final By projectFilterModerationButton = By.xpath("//*[@class='projects-list container ng-isolate-scope']//div[1]//*[text()='Модерация']");
    private final By projectSearchField = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[2]/div[1]/div[2]/label/../*[@id='searchModerate']");
    //"Редактировать" найденны проект
    private final By projectEditButton = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]//*[text()[contains(.,'Редактировать')]]");
    //добавление заднего фона проекта
    private final By backgroundImageButton = By.xpath("//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[2]/div/..//*[@id='file']");

    //private final By uploadBackgroundImage = By.id("UPLOADBACKGROUND");

    //информативное сообщение о "Проект сохранен" и "Файл загружен"
    private final By projectSaveMassage = By.xpath("//*[@id='toast-container']//*[text()[contains(.,'Проект сохранен')]]");
    private final By backgroundFileSaveMassage = By.xpath("//*[@id='toast-container']//*[text()[contains(.,'Файл загружен')]]");


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
        //"Редактировать" найденны проект
        driver.findElement(projectEditButton).click();
        //добавление заднего фона проекта
        driver.findElement(backgroundImageButton).click();


        driver.setFileDetector(new LocalFileDetector());
        WebElement upload = driver.findElement(By.id("file"));
        upload.sendKeys("UPLOADBACKGROUND");


        //информативное сообщение о "Проект сохранен" и "Файл загружен"
        driver.findElement(projectSaveMassage).isDisplayed();
        driver.findElement(backgroundFileSaveMassage).isDisplayed();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
