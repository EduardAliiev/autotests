package com.eduardaliiev.app.autotestdraft;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Eduard Aliiev on 9/22/16;
 */
public class GoogleSRPageTest {
    @Test
    public void searchForQ()  throws InterruptedException  {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com/");
        GoogleSRPage page =
                PageFactory.initElements(driver, GoogleSRPage.class);

        page.setSearchBox("Choose");
        Thread.sleep(20000);

    }
}
