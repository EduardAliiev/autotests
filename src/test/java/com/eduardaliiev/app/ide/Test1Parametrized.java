package com.eduardaliiev.app.math;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnitParamsRunner.class)
public class Test1Parametrized {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://form.jotformeu.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    @FileParameters("src/test/java/com/eduardaliiev/app/resources/newdata.csv")
    public void test1DataProvided(String name, String middleName, String lastName, String street, String secondStreet, String city, String province, String zipCode, String country, String month, String day, String year) throws Exception {
        driver.get(baseUrl + "/62511098839362");
        driver.findElement(By.id("first_64")).clear();
        driver.findElement(By.id("first_64")).sendKeys(name);
        driver.findElement(By.id("middle_64")).clear();
        driver.findElement(By.id("middle_64")).sendKeys(middleName);
        driver.findElement(By.id("last_64")).clear();
        driver.findElement(By.id("last_64")).sendKeys(lastName);
        driver.findElement(By.id("input_66_addr_line1")).clear();
        driver.findElement(By.id("input_66_addr_line1")).sendKeys(street);
        driver.findElement(By.id("input_66_addr_line2")).clear();
        driver.findElement(By.id("input_66_addr_line2")).sendKeys(secondStreet);
        driver.findElement(By.id("input_66_city")).clear();
        driver.findElement(By.id("input_66_city")).sendKeys(city);
        driver.findElement(By.id("input_66_state")).clear();
        driver.findElement(By.id("input_66_state")).sendKeys(province);
        driver.findElement(By.id("input_66_postal")).clear();
        driver.findElement(By.id("input_66_postal")).sendKeys(zipCode);
        new Select(driver.findElement(By.id("input_66_country"))).selectByVisibleText(country);
        new Select(driver.findElement(By.id("input_71_month"))).selectByVisibleText(month);
        new Select(driver.findElement(By.id("input_71_day"))).selectByVisibleText(day);
        new Select(driver.findElement(By.id("input_71_year"))).selectByVisibleText(year);
        new Select(driver.findElement(By.id("input_69"))).selectByVisibleText("Work");
        Thread.sleep(5000);
        driver.findElement(By.id("input_62")).click();
        Thread.sleep(1000);
        assertEquals("Thank You!", driver.findElement(By.xpath("html/body/div[1]/h1/span")).getText());
        Thread.sleep(5000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}