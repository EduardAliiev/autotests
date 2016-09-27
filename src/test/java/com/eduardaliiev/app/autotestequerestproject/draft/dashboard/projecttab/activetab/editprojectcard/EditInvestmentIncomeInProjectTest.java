package com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.activetab.editprojectcard;

import com.eduardaliiev.app.autotestequerestproject.BaseTest;
import com.eduardaliiev.app.autotestequerestproject.ProjectActivePage;
import com.eduardaliiev.app.autotestequerestproject.common.MainPage;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Eduard Aliiev on 9/27/16;
 */
@RunWith(JUnitParamsRunner.class)
public class EditInvestmentIncomeInProjectTest extends BaseTest{
    private EditInvestmentIncomeInProject editValueInvestment(String login, String password, String projectName) {
        MainPage mainPage = new MainPage("https://dev.equerest.com/", driver);
        ProjectActivePage projectActivePage = mainPage.openLoginPage()
                .loginActiveAs(login, password);

//передаем нажатие на [Проект] -> "Активные" ищем проект
        return projectActivePage.navigateToActiveProjectPageViaMenuItem()
                .searchActiveProjectByName(projectName);
    }
    //"Активные" section is delete video link.
    @Test
    @FileParameters("src/main/java/com/eduardaliiev/app/autotestequerestproject/resources/login_project_info_Active.csv")
    public void editInvestmentIncome(String login, String password, String projectName) {
        EditInvestmentIncomeInProject selectedProject = editValueInvestment(login, password, projectName);

        selectedProject.editAndSaveStandardProjectField();
    }
}
