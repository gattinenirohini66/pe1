package com.stackroute;
//To reverese the string

public class CheckReverse {
    public String checkReverse(String str){
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
