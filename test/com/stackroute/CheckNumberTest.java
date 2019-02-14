package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumberTest {

    CheckNumber cn=new CheckNumber();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkNumber() {
        String input="Guessed number is greater than target";
        String output=cn.checkNumber(23,25);
        assertEquals(input,output);
    }
}