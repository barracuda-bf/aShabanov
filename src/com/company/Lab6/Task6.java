package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by pro-10 on 07.04.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a;
        int b;

        a = ckn.nextInt();
        b = ckn.nextInt();
        if (a > b) {
            int c = b;
            while (a >= c) { //условие продолжения
                System.out.print(c + " ");
                c++;
            }
        } else {
            int d = a;
            while (d <= b) { //условие продолжения
                System.out.print(d + " "); // повторяющеесе действие
                d++; // отметка о повторении, шаг
            }
        }
    }
}


