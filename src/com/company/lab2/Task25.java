package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task25 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        b = skan.nextInt();
        c = skan.nextInt();
        double c1 = c*Math.PI/180;
        double d = Math.sqrt(Math.pow (a,2)+Math.pow (b,2) - 2 * a * b * Math.cos(c1) );
        System.out.format("%.4f%n",d);
    }
}
