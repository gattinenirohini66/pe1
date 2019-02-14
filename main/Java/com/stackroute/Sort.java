package com.stackroute;
//To sort in desending order

public class Sort {
    public boolean sortMethod(long x){
        String n=Long.toString(x);
        char[] a= n.toCharArray();

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    char t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                sum+=(a[i]-48);
            }
        }
        if(sum>15)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
