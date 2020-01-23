package com.lambton;

public class Third {
    public static void main(String[] args) {

        //int i, j, k = 1;
       // for (i = 1; i <= 5; i++) {
        //    for (j = 1; j < i + 1; j++) {
          //      System.out.print(k++ + " ");
          //  }

           // System.out.println();
        //}
        int i,j,count=0,icnt=0;
        String s="welcome to toronto";
        char[] ch= s.toCharArray();
        int length= ch.length;
       // int n= s.length();
        for( i=0;i<length;i++)
        {
            if(i==0)
                System.out.println(ch[0]);
            else
            {
                if(count+1>=length)
                {break;}
                else
                {
                    for(j=count+1;j<i+count+2;j++)
                    {
                        icnt++;
                        if(j>=length)
                            break;
                        else
                            System.out.print(ch[j]);
                    }
                    count=count+icnt;
                    icnt=0;
                }
                System.out.println();
            }
        }
    }
}