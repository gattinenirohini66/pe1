package com.stackroute;
//To check whether given number is palindrome or not

public class CheckPalindrome {
    public int checkPalindrome(long x){
        String n=Long.toString(x);
        char[] a= n.toCharArray();
        char[] r=new char[a.length];
        for(int i=0;i<a.length;i++)
        {
            r[i]=a[a.length-i-1];
        }
        int sum=0;
        if(Arrays.equals(a, r))
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%2==0)
                {
                    sum+=(a[i]-48);
                }
            }
            if(sum>25)
            {
                return 1;
            }
            else {
                return 2;
            }
        }
        else
        {
            return 3;
        }
    }

}
