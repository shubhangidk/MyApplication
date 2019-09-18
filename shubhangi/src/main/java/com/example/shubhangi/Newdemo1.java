package com.example.shubhangi;


import java.util.Scanner;

public class Newdemo1 {
    static int fact=1;
    Newdemo1()
    {

        System.out.println("fact:"+fact);
    }
    Newdemo1(int x) {
        for (int i = 1; i < 5; i++)
        {
            fact=fact*i;
        }
        System.out.println("fact"+fact);
    }

    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner B = new Scanner(System.in);
        int n;
        n = B.nextInt();
        if(n==0)
        {
            Newdemo1 g=new Newdemo1();
        }
        else
        if(n>0 && n<9)
        {
            Newdemo1 g=new Newdemo1(n);
        }

    }

}
