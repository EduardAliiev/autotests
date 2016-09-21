package com.eduardaliiev.app.arrays.equerest.equerestproject.pages.adminpanel;

import com.eduardaliiev.app.arrays.equerest.equerestproject.pages.AbstractPage;
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

    public ProjectsPage navigateToProjectPageViaMenuItem(){
        driver.findElement(projectsMenuItem).click();
        return new ProjectsPage(driver);
    }
}
