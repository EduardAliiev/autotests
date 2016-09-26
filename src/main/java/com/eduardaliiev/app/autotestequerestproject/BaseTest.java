package com.eduardaliiev.app.autotestequerestproject;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eduard Aliiev on 9/25/16;
 */
public class BaseTest {
  protected WebDriver driver;
   // String baseUrl = "https://dev.equerest.com/";

    @Before
    public void setUp() {
        this.driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       // driver.get(baseUrl + "register#/");

    }

    @After
    public void tearDown() { driver.close(); }

}
