package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task27 {
    public static void main(String[] args) {
        int a;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        double b = a * Math.PI / 180;
        double c = Math.sqrt(1-Math.pow(Math.sin(b),2));
        System.out.format("%.4f%n",c);
    }
}
