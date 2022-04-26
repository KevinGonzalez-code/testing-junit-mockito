package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.*;


public class StringUtilTest {

    @Nested
    private String srt;
    private StringUtil stringUtil;

    @Before
    public void setup(){
        stringUtil = new StringUtil();
    }

    @Test
    public void isEmptyNull() {
        srt = null;

        boolean resul = stringUtil.isEmpty(srt);

        Assert.assertTrue(resul);
    }

    @Test
    public void isNotEmpty() {
        srt = "Hello Word";

        boolean resul = stringUtil.isEmpty(srt);

        Assert.assertFalse(resul);
    }

    @Test
    public void isEmpty() {
        srt = "";

        boolean resul = stringUtil.isEmpty(srt);

        Assert.assertTrue(resul);
    }

    @Test
    public void isEmptyTrim() {
        srt = " Hello Word ";

        boolean resul = stringUtil.isEmpty(srt);

        Assert.assertTrue(resul);
    }

}