package com.stackroute;
//To check vowel or consonant

public class CheckVowel {
    public String checkVowel(String str){
        String temp="";
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' ||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                temp="Vowel";
            else
                temp="Consonant";
        }
        return temp;
    }
}
