package com.company.Lab6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a;
        int b;

        a = ckn.nextInt();
        b = ckn.nextInt();
        if (a < b) {
            while (a <= b) { //условие продолжения
                System.out.print(a + " ");
                a++;
            }
        } else {
            while (b <= a) { //условие продолжения
                System.out.print(a + " "); // повторяющеесе действие
                a--; // отметка о повторении, шаг
            }
        }
    }

}
