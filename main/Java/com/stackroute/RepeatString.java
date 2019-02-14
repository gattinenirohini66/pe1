package com.stackroute;
//To print Repeatstring

public class RepeatString {
    public String repeatString(String str, int n){
        int i=0;
        String sub = str;
        while(i<n){
            sub = sub + (str.substring(str.length()-n));
            i++;
        }
        return sub;
    }
}
