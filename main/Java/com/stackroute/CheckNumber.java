package com.stackroute;
//To check the target number is equal to guess number

public class CheckNumber {
    public String checkNumber(int t,int n) {
        String temp="";
        if (n >= 1 && n <= 50) {
            boolean flag = true;
            while (flag) {
                if (n > t) {
                    temp="Guessed number is greater than target";
                } else if (n < t) {
                    temp="Guessed number is less than target";
                } else {
                    temp="Guessed number matched the target";
                    flag = true;
                }
            }
        }
        return temp;
    }
}

