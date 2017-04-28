package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 18.04.2017.
 */
public class Task20 {
    public static void main(String[] args) {
        int a;
        int i = 30;
        Scanner x = new Scanner(System.in);
        System.out.println("Selekt 30-40:");
        a = x.nextInt();
        if ((a < 30) || (a > 40)) {
            System.out.println("ERROR");
        } else {
            while (i <= 40) {
                if (i == a) {
                    System.out.println(i + "+"); // вывод + напротив нужного числа
                } else {
                    System.out.println(i + "-"); // вывод всех чисел
                }
                i++;
            }
        }
    }
}
