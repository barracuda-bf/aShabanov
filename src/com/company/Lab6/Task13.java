package com.company.Lab6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a = ckn.nextInt();
        int b = ckn.nextInt();
        int c = 0;
        if (a < b) {
            while (a <= b) {
                c = c + a;
                a++;
            }

        } else {
            while (b<=a) {
                c = c + b;
                b++;

            }
        }
        System.out.println(c);
    }
}