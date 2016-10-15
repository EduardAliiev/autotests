package com.eduardaliiev.app.autotestequerestproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by cherleo on 9/19/16.
 */
public class BaseAdminPanelPage extends AbstractPage {

    private By projectsMenuItem = By.xpath("//*[@id='js-navbar-collapse']//*[text()='Проекты']");

    public BaseAdminPanelPage(WebDriver driver){
        super(driver);
    }

    public ProjectModerationPage navigateModerationToProjectPageViaMenuItem(){
        driver.findElement(projectsMenuItem).click();
        return new ProjectModerationPage(driver);
    }
    public ProjectActivePage navigateToActiveProjectPageViaMenuItem(){
        driver.findElement(projectsMenuItem).click();
        return new ProjectActivePage(driver);
    }
}
