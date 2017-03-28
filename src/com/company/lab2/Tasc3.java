package com.company.lab2;

import java.util.Scanner;

/* задача 4
 */
public class Tasc3 {
    public static void main(String[] args) {
        System.out.println("Selekt a:");
        int a1;
        double b = Math.PI;
        Scanner x = new Scanner(System.in);
        a1 = x.nextInt();
        double c = 2 * b * (a1);
        System.out.format("%.4f%n", c);
    }
}
