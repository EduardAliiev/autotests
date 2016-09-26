package com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.moderationtab.removeproject;


import com.eduardaliiev.app.autotestequerestproject.ProjectPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Eduard Aliiev on 9/18/16;
 */
public class RemoveVideoLink extends ProjectPage {

    //"Редактировать" найденны проект
    protected final By editUploadVideoButton = By.xpath("//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[1]/div[3]//*[@class='edit-btn']");
    protected final By deleteVideoLinksInField = By.xpath("//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[1]/div[3]/div/div/label/../*[@id='yt_link']");
    protected final By applyVideoLinksButton = By.xpath("//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[1]/div[3]/div/div/label/../*[text()[contains(.,'Применить')]]");
    //информативное сообщение о "Проект сохранен"
    protected final By projectSaveMassage = By.xpath("//*[@id='toast-container']//*[text()[contains(.,'Проект сохранен')]]");


    public RemoveVideoLink(WebDriver driver) {
        super(driver);
    }


    public RemoveVideoLink deleteVideoLink() {
        //добавляем ссылку на "Видео" -> "Применить"
        driver.findElement(editUploadVideoButton).click();
        driver.findElement(deleteVideoLinksInField).clear();
        driver.findElement(applyVideoLinksButton).click();
        //информативное сообщение о "Проект сохранен"
        driver.findElement(projectSaveMassage).isDisplayed();

        return new RemoveVideoLink(driver);
    }

}
