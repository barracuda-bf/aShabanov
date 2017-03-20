package com.company.lab1;

import java.util.Scanner;

/**
 * Created by adm on 20.03.2017.
 */
public class Task8 {
    public static void main(String[] args) {  //точка входа в программу
        Scanner s = new Scanner(System.in);// создаем сканер консоли для считывания
        int a; // объявление переменной
        a = s.nextInt(); // считываем введеную строку
        System.out.format("\"%d\"", a); // выод считаной строки на экран
    }
}
