package com.company.Lab6;

import java.util.Scanner;

public class Task181 {
    public static void main(String[] args) {
        int a;
        int i = 10;
        Scanner x = new Scanner(System.in);
        System.out.println("Selekt 10-20:");
        a = x.nextInt();
        while (i <= 20) {
            if (i == a) {
                System.out.println(i + "+"); // вывод + напротив нужного числа
                } else {
                System.out.println(i); // вывод всех чисел
                }
            i++;
        }
    }
}
