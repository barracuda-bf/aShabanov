package com.company.lab2;

import java.util.Scanner;

/**
 * Created by pro-8 on 24.03.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        int A;
        Scanner x = new Scanner(System.in);
        A = x.nextInt();
        double c = A%360*Math.PI/180;                // % - стко отделение целого числа  и это формула вычисления радианов
        System.out.format ("%.4f%n",c);

    }
}
