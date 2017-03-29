package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task35 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        b = skan.nextInt();
        double c = Math.sqrt(Math.pow(b,2)+Math.pow(a,2));
        System.out.format("%.4f%n",c);
    }
}
