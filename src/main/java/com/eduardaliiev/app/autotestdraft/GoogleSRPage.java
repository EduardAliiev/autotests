package com.eduardaliiev.app.autotestdraft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Eduard Aliiev on 9/22/16;
 */
public class GoogleSRPage {
    //FirefoxDriver driver;

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    public void setSearchBox(String text) {
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}
