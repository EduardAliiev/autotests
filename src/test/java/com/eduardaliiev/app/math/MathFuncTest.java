package com.eduardaliiev.app.math;

import com.eduardaliiev.app.arrays.math.MathFunc;
import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void multiplyTest() {
        int a=2, b=3, expRes = 6;
        Assert.assertEquals(expRes, MathFunc.multipy(a,b));
    }
}
