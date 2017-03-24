package com.company.lab1;

import java.util.Scanner;

/**
 * Created by adm on 20.03.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// создаем сканер консоли для считывания
        double a; // объявление переменной
        a = s.nextDouble(); // считываем введеную строку
        System.out.format("%.4f%n", a); // выод считаной строки на экран c 4 знакоми после запятой
    }
}
