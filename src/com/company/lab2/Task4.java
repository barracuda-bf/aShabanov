package com.company.lab2;

import java.util.Scanner;

/* задача 5

 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите значение R:");
        int a;
        double b = Math.PI;
        int b1 = 3;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        double c = Math.pow(a, b1);
        double d = 4 * b * c / 3;
        System.out.format("%.4f%n", d);

    }
}
