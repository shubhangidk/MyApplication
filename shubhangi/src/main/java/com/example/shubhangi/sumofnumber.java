package com.example.shubhangi;

import java.util.Scanner;

public class sumofnumber {
    public static void main(String[] args) {
        int sn=0,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no.:");

        n=scan.nextInt();
        for(int i =1;i<=n;i++)
        {
            sn = (n * (n + 1)) / 2;
        }
        System.out.println(sn);
    }
}
