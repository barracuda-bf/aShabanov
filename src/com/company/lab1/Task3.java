package com.company.lab1;
import java.util.Scanner; // импортирование классов
/**
 * Created by adm on 20.03.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// создаем сканер консоли для считывания
        String a; // объявление переменной
        a = s.next(); // считываем введеную строку
        System.out.println(a + " нас не остановят!" );
    }
}
