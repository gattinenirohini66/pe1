package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckVowelTest {

    CheckVowel cv=new CheckVowel();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkVowel() {
        String input="Vowel";
        String output=cv.checkVowel("a");
        assertEquals(input,output);
    }
}