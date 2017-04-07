package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by наш on 03.04.2017.
 */
public class Task13 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner x = new Scanner(System.in);
        System.out.println("Selekt x:");
        a = x.nextDouble();
        System.out.println("Selekt y:");
        b = x.nextDouble();
        System.out.println("Selekt z");
        c = x.nextDouble();

        if ((a==b)||(b==c)||(a==c)) {
            System.out.println("Среди чисел есть равные");
        } else {
            System.out.println("Среди чисел нет равных");
        }
    }
}
