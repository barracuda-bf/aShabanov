package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task30 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        b = skan.nextInt();
        double a1 = a * Math.PI / 180;
        double b1 = b * Math.PI / 180;
        double c = Math.sin(a1)*Math.cos(b1)+Math.cos(a1)*Math.sin(b1);
        System.out.format("%.4f%n", c);
    }
}
