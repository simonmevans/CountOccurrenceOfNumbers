package com.company;

import java.util.Scanner;

public class Main {
    public static void printIntAry(int []ary)
    {
        for (int x : ary) {
            if(x!=0) {System.out.println(x);}
        }
    }
    public static String removeEndToken(String x) {
        x = x.substring(0, x.length() - 1);
        return x;
    }

    public static void breakStringToIntAry(String x, int ary[]) {
        int index = 0;
        String digit = " ";
        int count = 0;
        while (index != -1) {

            index = x.indexOf(' ');
            if (index != -1) {
                digit = x.substring(0, index);
                ary[count] = Integer.parseInt(digit);
                x = x.substring(index + 1, x.length());
                count++;
            }
        }
    }

    public static boolean isDigitInArray (int []ary, int x)
    {
        boolean flag = false;
        for(int i = 0; i < ary.length; i++)
        {
            if(ary[i] == x){flag = true;}
        }
        return flag;
    }

    public static void copyDigits(int []ary, int[]bry)
    {
        int count = 0;
        for(int i = 0; i < ary.length; i++)
        {
            if (! isDigitInArray(bry, ary[i]))
            {
                bry[count] = ary[i];
                count++;
            }
        }
    }

    public static void countOcc (int ary[], int bry[])
    {
        int count = 0;
        for (int i = 0; i < bry.length; i++)
        {
            for(int j =0; j< ary.length; j++)
            {
                if(bry[i] == ary[j]){
                    count++;
                }
            }
            if(bry[i]!= 0) {
                System.out.println(bry[i] + " Occurs : " + count + " times");
            }
            count = 0;
        }
    }
    public static void main(String[] args) {
        int ary[] = new int[100];
        int bry[] = new int[100];
        String ProgramDescription = "Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.";
        System.out.println(ProgramDescription);
        System.out.println("Enter some digits from 1 to 100 when you are done press 0 then enter");
        Scanner input = new Scanner(System.in);
        String fakeInput = input.nextLine();
        System.out.println("you entered : " + fakeInput);
        fakeInput = removeEndToken(fakeInput);
        breakStringToIntAry(fakeInput, ary);
        copyDigits(ary,bry);
        countOcc(ary, bry);
    }
}
