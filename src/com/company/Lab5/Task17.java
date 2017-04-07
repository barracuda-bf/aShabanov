package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by наш on 03.04.2017.
 */
public class Task17 {
    public static void main(String[] args) {
        double a;
        double b;
        double c,d;
        Scanner x = new Scanner(System.in);
        System.out.println("Selekt M:");
        a = x.nextDouble();
        System.out.println("Selekt P:");
        b = x.nextDouble();
        if (a<=0||b<=0) {
            System.out.println("Сообщение об ошибке");
        }
        c = a/b;
        d = a%b;
        if (d>0){
            System.out.println("M не делится нацело на P");
        } else {
            System.out.println(c);
        }

    }
}
