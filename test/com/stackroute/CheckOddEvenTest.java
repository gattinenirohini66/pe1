package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOddEvenTest {

    CheckOddEven oe=new CheckOddEven();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkOddEven() {
        String input="Tom";
        String output=oe.checkOddEven(23);
        assertEquals(input,output);
    }
}