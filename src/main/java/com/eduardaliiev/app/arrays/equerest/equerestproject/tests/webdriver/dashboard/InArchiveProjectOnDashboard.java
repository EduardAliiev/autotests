package com.eduardaliiev.app.arrays.equerest.equerestproject.tests.webdriver.dashboard;

import com.eduardaliiev.app.arrays.equerest.equerestproject.pages.adminpanel.ProjectsPage;
import com.eduardaliiev.app.arrays.equerest.equerestproject.pages.common.MainPage;
import com.eduardaliiev.app.arrays.equerest.equerestproject.tests.BaseTest;
import org.junit.Test;

/**
 * Created by Eduard Aliiev on 9/21/16;
 */
public class InArchiveProjectOnDashboard extends BaseTest {

    private final static String LOGIN = "olegftzi@gmail.com";
    private final static String PASSWORD = "Oleg1234";
    private final static String PROJECT_NAME = "Интернет киоски \"Инетик\"";

    @Test
    public void InArchiveProject(){
        MainPage mainPage = new MainPage("https://dev.equerest.com/", driver);
        ProjectsPage projectsPage = mainPage.open()
                                                    .navigateToLoginPage()
                                                    .loginAs(LOGIN, PASSWORD);

        projectsPage.navigateToProjectPageViaMenuItem()
                .selectModerationFilter()
                .searchProjectByName(PROJECT_NAME);

    }
}