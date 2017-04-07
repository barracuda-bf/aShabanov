package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by pro-10 on 07.04.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);

        int c = 0;
        int a; // сколько нужно сделать оперций
        String b; // сколько уже сделано
        b = ckn.next();
        a = ckn.nextInt();
        System.out.print("\"");
        while (c <= a) { //условие продолжения
            System.out.print(b); // повторяющеесе действие
            c++; // отметка о повторении, шаг
        }
        System.out.println("\"");
    }
}