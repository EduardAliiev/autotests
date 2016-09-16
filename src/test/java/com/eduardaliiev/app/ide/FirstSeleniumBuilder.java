/*
package com.eduardaliiev.app.ide;

import junitparams.FileParameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class FirstSeleniumBuilder {
    private FirefoxDriver wd;

    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    @FileParameters("src/test/java/com/eduardaliiev/app/resources/testdatasite.csv")
    public void firstSeleniumTest (String name, String middleName, String lastName, String street, String secondStreet, String province, String city, String zipCode, String country) {
        wd.get("https://form.jotformeu.com/62511098839362");
//        wd.findElement(By.id("input_20")).click();
//        wd.findElement(By.id("input_20")).clear();
//        wd.findElement(By.id("input_20")).sendKeys("Eduard");
        wd.findElement(By.id("first_64")).click();
        wd.findElement(By.id("first_64")).clear();
        wd.findElement(By.id("first_64")).sendKeys(name);
        wd.findElement(By.id("middle_64")).click();
        wd.findElement(By.id("middle_64")).clear();
        wd.findElement(By.id("middle_64")).sendKeys(middleName);
//        wd.findElement(By.id("input_20")).click();
//        wd.findElement(By.id("input_20")).clear();
//        wd.findElement(By.id("input_20")).sendKeys("Eduard Aliiev Aliiev");
        wd.findElement(By.id("last_64")).click();
        wd.findElement(By.id("last_64")).clear();
        wd.findElement(By.id("last_64")).sendKeys(lastName);
        wd.findElement(By.id("input_66_addr_line1")).click();
        wd.findElement(By.id("input_66_addr_line1")).clear();
        wd.findElement(By.id("input_66_addr_line1")).sendKeys(street);
        wd.findElement(By.id("input_66_addr_line2")).click();
        wd.findElement(By.id("input_66_addr_line2")).clear();
        wd.findElement(By.id("input_66_addr_line2")).sendKeys(secondStreet);
//        wd.findElement(By.id("input_66_city")).click();
//        wd.findElement(By.id("input_66_city")).sendKeys("\\9");
        wd.findElement(By.id("input_66_state")).click();
        wd.findElement(By.id("input_66_state")).clear();
        wd.findElement(By.id("input_66_state")).sendKeys(province);
        wd.findElement(By.id("input_66_city")).click();
        wd.findElement(By.id("input_66_city")).clear();
        wd.findElement(By.id("input_66_city")).sendKeys(city);
        wd.findElement(By.id("input_66_postal")).click();
        wd.findElement(By.id("input_66_postal")).clear();
        wd.findElement(By.id("input_66_postal")).sendKeys(zipCode);

        new Select(wd.findElement(By.id("input_66_country"))).selectByVisibleText(country);

        wd.findElement(By.id("input_62")).click();
        assertTrue(wd.findElement(By.tagName("html")).getText().contains("Thank You"));
    }

    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
*/
