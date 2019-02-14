package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnSpcifiedTest {

    UnSpcified u=new UnSpcified();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void numberAdd() {
        int input=80;
        int output=u.numberAdd("12 56 12");
        assertEquals(input,output);
    }
}