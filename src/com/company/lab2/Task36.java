package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task36 {
    public static void main(String[] args) {
        int a;  //xa
        int b;  // ya
        int c; // xb
        int d; // yb
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        b = skan.nextInt();
        c = skan.nextInt();
        d = skan.nextInt();
        double q1 = Math.sqrt((Math.pow(c-a,2))+ (Math.pow(d-b,2)));
        System.out.format("%.4f%n",q1);
    }
}
