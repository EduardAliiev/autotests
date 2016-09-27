package com.eduardaliiev.app.autotestequerestproject;


import com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.moderationtab.removeproject.RemoveVideoLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Eduard Aliiev on 9/26/16;
 */
public class ProjectModerationPage extends BaseAdminPanelPage{

    /*####################_МОДЕРАЦИЯ_####################*/
    //в разделе "Проекты" -> "Модерация" ищем проект
    private final By projectFilterModerationButton = By.xpath("//*[@class='projects-list container ng-isolate-scope']//div[1]//*[text()='Модерация']");
    private final By projectSearchField = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[2]/div[1]/div[2]/label/../*[@id='searchModerate']");
    //"Редактировать" найденны проект
    private final By projectEditButton = By.xpath("//*[@id='wrapper']/main/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]//*[text()[contains(.,'Редактировать')]]");

    public ProjectModerationPage(WebDriver driver) {
        super(driver);
    }

    //"Редактировать" найденны проект
    public RemoveVideoLink videoLink(){
        //"Редактировать" найденный проект
        driver.findElement(projectEditButton).click();
        return new RemoveVideoLink(driver);
    }

    public RemoveVideoLink searchProjectByName (String projectName){
        //в разделе "Проекты"(extend BaseAdminPanelPage) -> "Модерация" ищем проект
        driver.findElement(projectFilterModerationButton).click();
        driver.findElement(projectSearchField).sendKeys(projectName);
        return videoLink();
    }



}
