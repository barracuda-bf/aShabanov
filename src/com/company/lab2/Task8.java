package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 27.03.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во метров:");
        int a; // метры
        int b; // сантиметры
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        System.out.println("Введите длину в сантиметрах");
        b = skan.nextInt();
        double c = a*100 / b;
        int d = a * 100%b;

        System.out.format ("%.0f%n", c);//+ d "см");
        System.out.println(d + " шт.");

    }
}
