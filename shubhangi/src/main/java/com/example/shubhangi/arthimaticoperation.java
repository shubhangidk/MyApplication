package com.example.shubhangi;
import java.util.Scanner;
public class arthimaticoperation {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);


        System.out.println("enter the value of a");
        a = scan.nextInt();
        System.out.println("enter the value of b");
        b = scan.nextInt();

        
        /* addition */
        c = a + b;
        System.out.println("addition of two number" + c);

        //subtraction
        c = a - b;
        System.out.println("subtraction of two number" + c);

        //multiplication
        c = b * a;
        System.out.println("multiplication of two number" + c);

        //division
        c = a / b;
        System.out.println("division of two numbaer" + c);

        //remainder
        c = a % b;
        System.out.println("remainder of two number" +c);
    }
}
