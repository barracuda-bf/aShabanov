package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task37 {
    public static void main(String[] args) {
        int a;  //v1
        int b;  // t1
        int c; // v2
        int d; // t2
        Scanner skan = new Scanner(System.in);
        System.out.println("Selekt v1:");
        a = skan.nextInt();
        System.out.println("Selekt t1:");
        b = skan.nextInt();
        System.out.println("Selekt v2:");
        c = skan.nextInt();
        System.out.println("Selekt t2:");
        d = skan.nextInt();
        int v1 = a+c;
        int numerator = (b*a)+(d*c);
        int denominator = a+c;
        double t = (double)numerator/denominator;
        System.out.println("V= "+v1);

        System.out.print("T= ");
        System.out.format("%.4f%n",t);
            }

}
