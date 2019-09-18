package com.example.shubhangi;

public class callby {
    static void change(int m){
        m=m+5;
    }

    public static void main(String[] args) {
        int n=10;
        change(n);
        System.out.println(n);
    }
}
