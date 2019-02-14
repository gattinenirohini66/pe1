package com.stackroute;
//To check the given input is alphabet or digit or symbol

public class CheckDigit {
    public String checkDigit(String s){
        String temp="";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                temp="Capital letter";
            else if (ch >= 'a' && ch <= 'z')
                temp="Small letter";
            else if (ch >= '0' && ch <= '9')
                temp="Number";
            else
                temp="Symbol";
        }
        return temp;
    }
}
