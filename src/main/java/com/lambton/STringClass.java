package com.lambton;

import java.util.Scanner;

public class STringClass
{
    public static void main(String[] args)
    {

        String s="welcome to toronto";
        int n,r, num = 1, c, d,k=0;
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter the number of rows triangle to display");
       // n = in.nextInt();
       // System.out.println("Enter the number of columns  to display");
      //  r= in.nextInt();
      //  char[] ct = s.toCharArray();
     //   char Spell= ' ';

      //  int number = 1;
       // for (int row = 1; row <= 6; row++) {
        //    for (int column = 1; column <= row; column++) {
         //       System.out.print(number + " ");
         //       number++;
         //   }
          //  System.out.println();

        //}
        Aer("welcome to toronto");

}
    public static String Aer(String str) {
        char[] charray = str.toCharArray();

        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < charray.length) {
            if (Character.isLetter(charray[i])) {
                char ch = (char) (charray[i]);

               sb.append(ch);
                System.out.println(sb);
                i++;

            } else if ((char) charray[i] == ' ')
            {
               sb.append(' ');
              i++;
            }



        }
        System.out.println(sb);
        return sb.toString();
    }
    }

