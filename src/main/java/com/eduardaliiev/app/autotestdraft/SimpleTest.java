package com.eduardaliiev.app.autotestdraft;

import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

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
            checkResult(getDivisionResult(4,2), 2);
            
        }
    @Step("Проверка полученного результата")
    private void checkResult(int actualResult, int expectedResult){
        Assert.assertTrue("Actual result (" + actualResult + ") not equals to expected(" + expectedResult + ")", actualResult == expectedResult);
    }
        
    @Step("{0}")
    private void log(String sdsd) {
    }

    @Step ("Получение результата {0} na {1}")
    private int getDivisionResult(int firstInt, int secondInt) {
        checkNotZiro(secondInt);
        return firstInt / secondInt;
    }

    @Step("Проверка деления")
    private void checkNotZiro(int intValue) {
        log("Значения делителя: " + intValue);
        Assert.assertTrue("Делитель равен: ", intValue !=0);
    }
}

