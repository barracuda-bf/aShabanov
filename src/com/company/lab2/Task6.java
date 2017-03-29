package com.company.lab2;

import java.util.Scanner;

/**
 * Created by pro-8 on 24.03.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner x = new Scanner(System.in);
        a = x.nextDouble();
        b = x.nextDouble();
        if (a<=0){
            System.out.println("Error");
            return;
        }
            if (b<=0){
                System.out.println("Error1");
                return;
            }

        double c = a * b / 2;
        System.out.println (c);

    }
}
