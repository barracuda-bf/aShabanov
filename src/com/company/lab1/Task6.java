package com.company.lab1;

/**
 * Created by adm on 20.03.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        double a = 13.11;
        System.out.format("%f%n",a);
        System.out.format("%.4f%n", Math.PI); // сначала описывается формат вывода инвормации, а затем переменные значение которых будут подставлены
        System.out.format ("%.4f%n", Math.E); // в формате можно писать и слова, а потом и значения, вывод инф. будет поледовательным
    }
}
