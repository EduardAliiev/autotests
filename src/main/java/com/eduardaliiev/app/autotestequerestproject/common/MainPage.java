package com.eduardaliiev.app.autotestequerestproject.common;

import com.eduardaliiev.app.autotestequerestproject.AbstractPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Eduard Aliiev on 9/25/16;
 */
public class MainPage extends AbstractPage {
    private String url;
    private static final String LOGIN_PAGE_URL = "register#/";

    public MainPage(String url, WebDriver driver) {
        super(driver);
        this.url = url;
    }

    public MainPage open() {
        driver.navigate().to(url);
        return this;
    }

    public LoginPage navigateToLoginPage() {
        driver.navigate().to(url + LOGIN_PAGE_URL);
        return new LoginPage(driver);
    }

    /**
     * Method consolidate actions needed for typical flow of opening login page
     */
    public LoginPage openLoginPage() {
        open();
        return navigateToLoginPage();
    }
}
