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

    public ProjectPage navigateToProjectPageViaMenuItem(){
        driver.findElement(projectsMenuItem).click();
        return new ProjectPage(driver);
    }
}
