package com.company.Lab5;

import java.util.Scanner;

/*
почему программа выводит вместо обозначенных 4 символов, выводит 6 ?????
 */
public class Task10a {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double a1,a2,b1,b2,c1,c2;
        Scanner x = new Scanner(System.in);
        a = x.nextDouble();
        b = x.nextDouble();
        c = x.nextDouble();
        if (a>0) {
            a1 = Math.pow(a,2);
            System.out.format("%4f;",a1);
        } else {
            a2=a;
            System.out.format("%4f;",a2);
        }

        if (b>0){
            b1 = Math.pow(b,2);
            System.out.format("%4f;",b1);
        } else {
            b2 = a;
            System.out.format("%4f;",b2);
        }
        if (c>0) {
            c1 = Math.pow(c,2);
            System.out.format("%4f;",c1);
        } else {
            c2 = c;
            System.out.format("%4f;",c2);
        }

    }
}
