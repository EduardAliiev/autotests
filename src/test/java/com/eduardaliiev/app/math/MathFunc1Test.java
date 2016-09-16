package com.eduardaliiev.app.math;

import com.eduardaliiev.app.arrays.math.MathFunc1;
import org.junit.Assert;
import org.junit.Test;

public class MathFunc1Test {
    @Test
    public void multiplyTest() {
        int a=2, b=3, expRes = 6;
        Assert.assertEquals(expRes, MathFunc1.multipy(a,b));
    }
}
