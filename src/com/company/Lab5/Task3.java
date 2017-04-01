package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by наш on 01.04.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int a;
        double b;
        double c;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        if (a >= 0) {
           b =  Math.sqrt(a);
            System.out.format("%.0f%n", b);
        } else {
            c = Math.pow(a, 2);
            System.out.format("%.0f%n", c);
        }
    }
}

