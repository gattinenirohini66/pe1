package com.stackroute;
//To print pattern

public class Printpattern {
    public void printPattern(int n){
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
        }
    }
}
