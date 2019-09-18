package com.example.shubhangi;
import java.util.Scanner;
public class factorial2 {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n");
        n=scan.nextInt();
        int nfact=1;
        //for(int i=1;i<=n;i++){
           // nfact=nfact*i;
       // }
        while(n!=0){
            System.out.println("before n="+n+"fact" );
            nfact=nfact*n;
            System.out.println("after n="+n+"fact" );
            final int i = n--;
        }
        System.out.println("factorial value is-" +nfact);
    }
}
