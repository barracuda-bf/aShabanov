package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by pro-8 on 29.03.2017.
 */
public class Task11 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        b = x.nextInt();
        c = x.nextInt();
        if ((a<b)&&(b<c)) {
            System.out.println("Выполняется");
        } else{
            System.out.println("Не выполняется");
        }
    }
}
