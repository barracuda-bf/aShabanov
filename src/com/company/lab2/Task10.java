package com.company.lab2;

import java.util.Scanner;

/**
 * Created by pro-8 on 24.03.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        int x; // угол в градусах
        double b; //угол в радианах
        double r; // результат
        Scanner s = new Scanner(System.in);
        System.out.println("Введите х:");
        x = s.nextInt();
        b = x*Math.PI/180; //перевод из градусов в радианы
        r = Math.sin (b); // вычисление синуса из радианов
        System.out.println(r);
    }
}
