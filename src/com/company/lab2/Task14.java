package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 28.03.2017.
 */
public class Task14 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner skan = new Scanner(System.in);

        a = skan.nextInt();
        b = skan.nextInt();
        double c = a * Math.sqrt(-7*b);
        System.out.format("%.4f%n",c);
    }
}
