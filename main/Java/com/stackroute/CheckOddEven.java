package com.stackroute;
//To check whether given num is odd or even

public class CheckOddEven {
    public String checkOddEven(int n){
        String temp="";
        if((n%2!=0) && (n>20 && n<30)) {
            temp="Tom";
        }
        else if((n%2==0) && (n>20 && n<30)) {
            temp="Jerry";
        }
        return temp;
    }
}
