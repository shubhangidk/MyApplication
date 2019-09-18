package com.example.shubhangi;

import java.util.Scanner;

public class Scannerprogram {
    static int fact=1;
    int a;
    Scannerprogram(){
        a=5;
    }
    public static void main(String[] args) {
        int i;
        for(i=1;i<=5;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);


    }
}
