package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckReverseTest {

    CheckReverse cr=new CheckReverse();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkReverse() {
        String input="inihor";
        String output=cr.checkReverse("rohini");
        assertEquals(input,output);
    }
}