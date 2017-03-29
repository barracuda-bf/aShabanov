package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 28.03.2017.
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner skan = new Scanner (System.in);
        System.out.println("x1");
        int x1;
        x1 = skan.nextInt();
        System.out.println("x2");
        int x2;
        x2 = skan.nextInt();
        System.out.println("x3");
        double x3;
        x3 = skan.nextDouble();
        double d = (x1 * x2) + (x1*x3) + (x2*x3);
        System.out.format("%.0f%n", d);

    }
}
