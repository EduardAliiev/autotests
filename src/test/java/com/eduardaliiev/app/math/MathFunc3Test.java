package com.eduardaliiev.app.math;

import com.eduardaliiev.app.arrays.math.MathFunc3;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MathFunc3Test {
    @Test
    @FileParameters("src/test/java/com/eduardaliiev/app/resources/testdata.csv")

    public void dataProviderTestAdd(int numA, int numB, int expOut) {
        Assert.assertEquals(expOut, MathFunc3.multipy(numA, numB));
    }
}

