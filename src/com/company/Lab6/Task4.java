package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 09.04.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Selekt A:");
        int a = w.nextInt();
        System.out.println("Selekt B:");
        int b = w.nextInt();
        if (a < b) {
            while (b >= a) { //условие продолжения
                System.out.print(b+" "); // повторяющеесе действие
                b--; // отметка о повторении, шаг
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
