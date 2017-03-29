package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by pro-8 on 29.03.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        double a;
        int b;
        Scanner x = new Scanner(System.in);
        a = x.nextDouble();
        b = x.nextInt();

        if (a*1000<b*0.305) {
            System.out.println("Растояние в километрах меньше");
        } else{
            System.out.println("Растояние в фунтах меньше");

        }
    }
}
