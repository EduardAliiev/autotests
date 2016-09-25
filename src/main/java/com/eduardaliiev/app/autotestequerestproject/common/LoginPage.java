package com.eduardaliiev.app.autotestequerestproject.common;

import com.eduardaliiev.app.autotestequerestproject.AbstractPage;
import com.eduardaliiev.app.autotestequerestproject.draft.dashboard.projecttab.moderationtab.removeproject.RemoveVideoLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Eduard Aliiev on 9/25/16;
 */
public class LoginPage extends AbstractPage {
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#submit-block .button.button-blue");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public RemoveVideoLink loginAs(String userName, String password) {
        driver.findElement(emailField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new RemoveVideoLink(driver);
    }
}
