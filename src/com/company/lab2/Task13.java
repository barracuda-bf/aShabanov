package com.company.lab2;

import java.util.Scanner;

/**
 * Created by pro-8 on 24.03.2017.
 */
public class Task13 {
    public static void main(String[] args) {
        double x;
        double r;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        r = Math.sqrt(x);
        double c = 3 * r;
        System.out.format("%.4f%n",c);

    }
}
