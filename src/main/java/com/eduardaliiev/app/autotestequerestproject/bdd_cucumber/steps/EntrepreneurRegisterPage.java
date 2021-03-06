package com.eduardaliiev.app.autotestequerestproject.bdd_cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Eduard Aliiev on 10/7/16;
 */
public class EntrepreneurRegisterPage {
    public WebDriver driver;

    @FindBy(id = "user_first_name")
    private WebElement firstNameTextBox;

    public EntrepreneurRegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        firstNameTextBox.sendKeys(firstName);
    }
}
