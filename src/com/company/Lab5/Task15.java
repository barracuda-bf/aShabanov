package com.company.Lab5;

import java.util.Scanner;

/*
 Как остановить действие программы ????? в момент если проверка ошибочная
 */
public class Task15 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner x = new Scanner(System.in);
        System.out.println("Selekt a:");
        a = x.nextDouble();
        System.out.println("Selekt b:");
        b = x.nextDouble();
        System.out.println("Selekt c");
        c = x.nextDouble();
        if (a<0||b<0||c<0) {
            System.out.println("Сообщение об ошибке");
        }
        if ((a==b)||(b==c)||(a==c)) {
            System.out.println("Треугольник является равнобедренным");
        } else {
            System.out.println("Треугольник не является равнобедренным");
        }
    }
}
