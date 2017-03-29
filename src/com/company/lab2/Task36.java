package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task36 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        b = skan.nextInt();
        c = skan.nextInt();
        d = skan.nextInt();
        double a1 = b-a;
        double b1 = d-c;
        double q1 = Math.sqrt((Math.pow(a1,2))+ (Math.pow(b1,2)));
        System.out.format("%.4f%n",q1);
    }
}
