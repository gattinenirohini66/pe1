package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    CheckPalindrome cp=new CheckPalindrome();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkPalindrome() {
        int input=3;
        int output=cp.checkPalindrome(243458);
        assertEquals(input,output);
    }
}