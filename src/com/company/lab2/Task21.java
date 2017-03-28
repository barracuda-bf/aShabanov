package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 27.03.2017.
 */
public class Task21 {
    public static void main(String[] args) {
        // Возведение в куб числа 2
        System.out.println("Введите число возводимое в куб:");
        double a3 ;
        int b3 = 3;
        Scanner x = new Scanner(System.in);
        a3 = x.nextDouble();
        double c = Math.pow(a3, b3);
        System.out.println(c);

    }
}
