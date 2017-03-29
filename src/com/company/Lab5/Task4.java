package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by pro-8 on 29.03.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        if (a < 0) {
            b = a * -1;         // решение для абсолютного значения
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
