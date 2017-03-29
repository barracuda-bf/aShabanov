package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task31 {
    public static void main(String[] args) {
        int a;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        double b = 7 * Math.pow(a, 2) - 3 * a + 6;
        System.out.format("%.0f%n",b);
    }

}
