package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 28.03.2017.
 */
public class Task12 {
    public static void main(String[] args) {
        int a; // угол в градусах
        double b; //угол в радианах
        double c; // результат
        Scanner s = new Scanner(System.in);
        System.out.println("Введите y:");
        a = s.nextInt();
        b = a*Math.PI/180; //перевод из градусов в радианы
        c = 5*Math.cos (b); // вычисление косинуса из радианов
        System.out.format("%.4f%n",c);
    }
}
