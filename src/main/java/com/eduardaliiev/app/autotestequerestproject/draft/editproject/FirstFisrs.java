package com.eduardaliiev.app.autotestequerestproject.draft.editproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by edikaliiev on 9/19/16;
 */
public class FirstFisrs {


        FirefoxDriver wd;

        @Before
        public void setUp() throws Exception {
            wd = new FirefoxDriver();
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

        @Test
        public void FirstFisrs() {
            wd.get("https://dev.autotestequerestproject.com/register/index");
            wd.findElement(By.id("email")).click();
            wd.findElement(By.id("email")).clear();
            wd.findElement(By.id("email")).sendKeys("olegftzi@gmail.com");
            wd.findElement(By.id("password")).click();
            wd.findElement(By.id("password")).clear();
            wd.findElement(By.id("password")).sendKeys("Oleg1234");
            wd.findElement(By.cssSelector("button.button.button-blue")).click();
            wd.findElement(By.xpath("//div[@id='wrapper']//button[.='Модерация']")).click();
            wd.findElement(By.xpath("//div[@class='tab-content']/div[2]/div[3]/div/div[2]/div/div[3]/a")).click();
            wd.findElement(By.xpath("//div[@class='project-roi']/div/button")).click();
           // wd.findElement(By.id("roi1")).click();
            wd.findElement(By.id("roi1")).clear();
            wd.findElement(By.id("roi1")).sendKeys("28");
          //  wd.findElement(By.id("roi1")).click();
            /*wd.findElement(By.id("roi1")).clear();
            wd.findElement(By.id("roi1")).sendKeys("20");*/
            wd.findElement(By.xpath("//div[@class='project-roi']/div/div[3]/button[2]")).click();
            wd.findElement(By.xpath("//div[@class='main']/div/div[1]")).click();
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

