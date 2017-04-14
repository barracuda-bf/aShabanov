package com.company.Lab6;

import java.util.Scanner;



public class Task17 {
    public static void main(String[] args) {

        Scanner ckn = new Scanner(System.in);
        double a = ckn.nextDouble();
        double b = ckn.nextDouble();
        double c;
        double d = 0;
        if (a <= b) {
            while (a <= b) {
                c = 0 + a;
                a++;
                d = d + Math.pow(a, 2);
            }

        } else {
            while (b <= a) {
                c = 0 + b;
                b++;
                d = d + Math.pow(b, 2);
            }
        }
        System.out.format("%.0f%n", d);

// почему через сканер не срабатывает ????????????????????????????????????????????????????????????????
        double a1 = 15;// сканер а
        double c1; //
        double d2 = 0;
        while (a1 <= 27) {
            c1 = 0 + a1;
            a1++;
            d2 = d2 + Math.pow(c1, 2);
        }
        System.out.println(d2);
    }
}