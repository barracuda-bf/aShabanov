package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task28 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int x;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        b = skan.nextInt();
        c = skan.nextInt();
        x = skan.nextInt();
        double d = 1 / Math.sqrt(a * Math.pow(x, 2) + b * x + c);
        System.out.format("%.4f%n", d);
    }
}
