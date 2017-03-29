package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by pro-8 on 29.03.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        b = x.nextInt();
        if (a>b) {
            System.out.println("Max "+a+" Min "+b);
        } else{
            System.out.println("Max "+b+ " Min "+a);

        }
    }

}

