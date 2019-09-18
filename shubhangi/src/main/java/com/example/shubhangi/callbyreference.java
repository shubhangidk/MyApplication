package com.example.shubhangi;

public class callbyreference {
    static void change(String b[]){
        b[2]="CUTE";
    }

    public static void main(String[] args) {
        String a[]=new String[20] ;
        a[2]="CRIMNAL";
        change(a);
        System.out.println(a[2]);
    }
}
