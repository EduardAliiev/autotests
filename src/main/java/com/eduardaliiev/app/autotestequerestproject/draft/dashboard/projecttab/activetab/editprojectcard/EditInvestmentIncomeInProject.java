package com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.activetab.editprojectcard;

import com.eduardaliiev.app.autotestequerestproject.ProjectActivePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Eduard Aliiev on 9/18/16;
 */
public class EditInvestmentIncomeInProject extends ProjectActivePage {

    //вводим значения "Инвестиционный доход"
    private final By infoInvestmentIncomeEditButton = By.cssSelector(".project-roi>div>button.edit-btn");
    /*private final By quickEditorFirstField = By.xpath("/*//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[2]/div[7]/div/div[3]/div[1]/label/..*//*[@id='roi1']");*/
    private final By quickEditorFirstField = By.cssSelector("#roi1");
    /*private final By quickEditorSecondField = By.xpath("/*//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[2]/div[7]/div/div[3]/div[2]/label/..*//*[@id='roi2']")*/;
    private final By quickEditorSecondField = By.cssSelector("#roi2");
    private final By quickEditorSaveButton = By.xpath("//*[@id='wrapper']/main/div/div/div/section[1]/div[2]/div/div[3]/div/div[2]/div[7]/div/div[3]//*[text()[contains(.,'Применить')]]");

    //информативное сообщение о "Проект сохранен"
    private final By projectSaveMassage = By.xpath("//*[@id='toast-container']//*[text()[contains(.,'Проект сохранен')]]");

    public EditInvestmentIncomeInProject(WebDriver driver, ProjectActivePage projectActivePage) {
        super(driver);
    }

    public EditInvestmentIncomeInProject editAndSaveStandardProjectField() {

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
        Assert.assertEquals(quickEditorFirstField,quickEditorFirstField);
        Assert.assertEquals(quickEditorSecondField,quickEditorSecondField);
        return new EditInvestmentIncomeInProject(driver, this);
    }
}