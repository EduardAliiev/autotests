package com.eduardaliiev.app.autotestequerestproject;

import com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.activetab.editprojectcard.EditInvestmentIncomeInProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Eduard Aliiev on 9/26/16;
 */
public class ProjectActivePage extends BaseAdminPanelPage {

    /*####################_Активные_####################*/
    //в разделе "Проекты" -> "Активные" ищем проект
   // private final By projectsMenuItem = By.xpath("//*[@id='js-navbar-collapse']//*[text()='Проекты']");
    private final By projectFilterActiveButton = By.xpath("//*[@class='projects-list container ng-isolate-scope']//div[1]//*[text()='Активные']");
    private final By projectSearchField = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[3]/div[1]/div[2]/label/../*[@id='searchActive']");
    //"Редактировать" найденны проект
    private final By projectEditButton = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div[3]//*[text()[contains(.,'Редактировать')]]");

    public ProjectActivePage(WebDriver driver) {
        super(driver);
    }

    //"Инвестиционный доход" в проект
    public EditInvestmentIncomeInProject investmentIncomeValue(){
        //"Инвестиционный доход" в проект
        driver.findElement(projectEditButton).click();
        return new EditInvestmentIncomeInProject(driver, this);
    }

    public EditInvestmentIncomeInProject searchActiveProjectByName (String projectName){
        //в разделе "Проекты"(extend BaseAdminPanelPage) -> "Активные" ищем проект
        driver.findElement(projectFilterActiveButton).click();
        driver.findElement(projectSearchField).sendKeys(projectName);
        return investmentIncomeValue();
    }

}
