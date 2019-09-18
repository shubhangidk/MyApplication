package com.example.shubhangi;

import java.util.Scanner;

public class factorial1 {
    static int fact(int m) {
        int f = 1,i=1;
//        for (int i = 1; i <= m; i++) {
        while(i<=m){

            f = f * i;
            i++;

        }
        return f;
    }

    public static void main(String[] args) {
        int n, r;
        Scanner d=new Scanner(System.in);
        System.out.println("enter n");
        n=d.nextInt();

        int nfact=1;
        for(int i=1;i<n;i++)
            nfact = nfact * i;
        System.out.println("fact value is-" +nfact);
        }
    }
