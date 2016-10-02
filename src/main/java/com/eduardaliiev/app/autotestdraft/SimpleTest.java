package com.equerest.tests.webdriver.adminpanel.projectpage.moderatesection;

import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;

/**
 * Created by Eduard Aliiev on 9/29/16;
 */
@Title("This is our cool suite")
@Description("Here we will check cool thing")
public class SimpleTest {

    @Title("First cool check")
    @Description("А вот что-то такое тут написать бы ...")
   // @Features("МАя футирес")
    //@Stories({"Стори 1"," и вот Стори 2"})
    @Test
        public void firstSimpleTest() {
            Assert.assertTrue() {
            checkResult(getDivisionresult(4,2), 2);
            }
        }


    @Step("{0}")
    private void log (String sdsd);
    @Step ("Получение {0} na {1}")
    private void getDivisionresult(int i, int i1) {
    }
    @Step("dsfsdfsdfsd")
    private void checkResult(void divisionresult, int i) {
    }
}

