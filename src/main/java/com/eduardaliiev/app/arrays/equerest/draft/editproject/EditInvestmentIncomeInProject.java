package com.eduardaliiev.app.arrays.equerest.draft.editproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eduard Aliiev on 9/18/16;
 */
public class EditInvestmentIncomeInProject {
    FirefoxDriver driver;
    String baseUrl = "https://dev.equerest.com/";
    //ввод данных пользователя, вспомогательные данные
    private final static String LOGIN = "olegftzi@gmail.com";
    private final static String PASSWORD = "Oleg1234";
    //входим в аккаунд
    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By loginButton = By.cssSelector("#submit-block > .button.button-blue");
    //в разделе "Проекты" -> "Активные" ищем проект
    private final By projectsMenuItem = By.xpath("//*[@id='js-navbar-collapse']//*[text()='Проекты']");
    private final By projectFilterActiveButton = By.xpath("//*[@class='projects-list container ng-isolate-scope']//div[1]//*[text()='Активные']");
    private final By projectSearchField = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[3]/div[1]/div[2]/label/../*[@id='searchActive']");
    //"Редактировать" найденны проект
    private final By projectEditButton = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div[3]//*[text()[contains(.,'Редактировать')]]");
    //вводим значения "Инвестиционный доход"
    private final By infoInvestmentIncomeEditButton = By.cssSelector(".project-roi>div>button.edit-btn");
    private final By quickEditorFirstField = By.xpath("//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[2]/div[7]/div/div[3]/div[1]/label/../*[@id='roi1']");
    private final By quickEditorSecondField = By.xpath("//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[2]/div[7]/div/div[3]/div[2]/label/../*[@id='roi2']");
    private final By quickEditorSaveButton = By.xpath("//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[2]/div[7]/div/div[3]//*[text()[contains(.,'Применить')]]");
    //информативное сообщение о "Проект сохранен"
    private final By projectSaveMassage = By.xpath("//*[@id='toast-container']//*[text()[contains(.,'Проект сохранен')]]");

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
        //в разделе "Проекты" -> "Активные" ищем проект
        driver.findElement(projectsMenuItem).click();
        driver.findElement(projectFilterActiveButton).click();
        driver.findElement(projectSearchField).sendKeys("Simple draft of #69 project");
        //"Редактировать" найденны проект
        driver.findElement(projectEditButton).click();
        //вводим значения "Инвестиционный доход"
        driver.findElement(infoInvestmentIncomeEditButton).click();

        driver.findElement(quickEditorFirstField).clear();
        driver.findElement(quickEditorFirstField).sendKeys("30");
        driver.findElement(quickEditorFirstField).click();

        driver.findElement(quickEditorSecondField).clear();
        driver.findElement(quickEditorSecondField).sendKeys("200");
        driver.findElement(quickEditorSecondField).click();

        driver.findElement(quickEditorSaveButton).click();
        //информативное сообщение о "Проект сохранен"
        driver.findElement(projectSaveMassage).isDisplayed();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
