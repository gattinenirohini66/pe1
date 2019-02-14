package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    Sort s=new Sort();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortMethod() {
        boolean input=false;
        boolean output=s.sortMethod(2456);
        assertEquals(input,output);
    }
}