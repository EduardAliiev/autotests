package com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.moderationtab.removeproject;

import com.eduardaliiev.app.autotestequerestproject.BaseTest;
import com.eduardaliiev.app.autotestequerestproject.ProjectPage;
import com.eduardaliiev.app.autotestequerestproject.common.MainPage;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Eduard Aliiev on 9/18/16;
 */
@RunWith(JUnitParamsRunner.class)
public class RemoveVideoLinkTest extends BaseTest {

    private RemoveVideoLink deleteVideoLinkOnPage(String login, String password, String projectName) {
        MainPage mainPage = new MainPage("https://dev.equerest.com/", driver);
        ProjectPage projectPage = mainPage.openLoginPage()
                .loginAs(login, password);

//передаем нажатие на [Проект] -> "Модерация" ищем проект
        return projectPage.navigateToProjectPageViaMenuItem()
                .searchProjectByName(projectName);
    }

    //"Модерация" section is delete video link.
    @Test
    @FileParameters("src/main/java/com/eduardaliiev/app/autotestequerestproject/resources/login_project_info.csv")
    public void deleteVideoLink(String login, String password, String projectName) {
        RemoveVideoLink selectedProject = deleteVideoLinkOnPage(login, password, projectName);

        //вызов класса: RemoveVideoLink
        selectedProject.deleteVideoLink();
    }
}
