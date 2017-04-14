package com.company.Lab6;

import java.util.Scanner;

public class Task271 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int b = 0; // счетчик символов в строке
        int c = 0; // переменная для количества строк
        int a = ckn.nextInt();
        if ((a < 0) || (a > 20)) {
            System.out.println("Error");
            return;
        }
        while (c<=9) {
            while (b < a) {
                System.out.print(c);
                b++;
            }
            c++;
            b = 0; // обнуление счетчика
            System.out.println();
        }
    }
}
