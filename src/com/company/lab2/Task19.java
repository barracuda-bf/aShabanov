package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task19 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner x = new Scanner(System.in);
        System.out.println("Celekt vo:");
        a = x.nextInt();
        System.out.println("Celect v:");
        b = x.nextInt();
        System.out.println("Celect a:");
        c = x.nextInt();
        double d = a * b + c * Math.pow (b,2) / 2;
        System.out.format("%.1f%n",d);
    }
}
