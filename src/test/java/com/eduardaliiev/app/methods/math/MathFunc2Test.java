package com.eduardaliiev.app.methods.math;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class MathFunc2Test {
    private int numberA, numberB, expected;
//parameters pass via this constructor

    public MathFunc2Test(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }
    //Declares parameters here
    @Parameterized.Parameters(name = "Test {index}: multiply({0}*{1})={2}") //test log output
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},    //If parameter is “{ 2, 2, 4 }”,
                {2, 2, 4},    // then {index} = test run # (from 0),
                {8, 2, 16}, // {0} = 2, {1} = 2, {2} = 2
                {4, 5, 20}
        });
    }
    @Test
    public void test_add() {
        Assert.assertEquals(expected, MathFunc2.multipy(numberA, numberB));
    }
}
