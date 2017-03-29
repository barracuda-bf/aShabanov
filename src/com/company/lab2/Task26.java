package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task26 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        b = skan.nextInt();
        c = skan.nextInt();
        d = skan.nextInt();
        double e = (a*b+d*c)/(a*b);
        System.out.format("%.4f%n",e);
    }
}
