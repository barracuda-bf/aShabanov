package com.company.Lab6;

/**
 * Created by наш on 12.04.2017.
 */
public class Task15 {
    public static void main(String[] args) {
        double a = 20;
        //double b = Math.pow(a, 3);
        double c;
        double d = 0;
        while (a <= 40) {
            c = 0 + a;
            a++;
            d = d + Math.pow(c, 3);
                   }
        System.out.format("%.0f%n",d);
    }
}