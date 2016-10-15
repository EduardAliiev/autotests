package com.eduardaliiev.app.autotestequerestproject;

import org.openqa.selenium.WebDriver;

/**
 * Created by Eduard Aliiev on 9/25/16;
 */
public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

}
