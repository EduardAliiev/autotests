package com.eduardaliiev.app.methods.math;

import org.junit.Assert;
import org.junit.Test;

public class MathFunc1Test {
    @Test
    public void multiplyTest() {
        int a=2, b=3, expRes = 6;
        Assert.assertEquals(expRes, MathFunc1.multipy(a,b));
    }
}
