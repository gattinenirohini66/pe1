package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {

    RepeatString rs=new RepeatString();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void repeatString() {
        String input="abcbcbc";
        String output=rs.repeatString("abc",2);
        assertEquals(input,output);
    }
}