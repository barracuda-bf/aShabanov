package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 18.04.2017.
 */
public class Task22 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a = ckn.nextInt();
        int d = ckn.nextInt();
        int b = 0;
        int c = 0; // изначальное количество
        if (a < d) {
            while (a <= d) {
                if (a % 7 == 0) { // кратность 7
                    b++; //хранит информацию о количестве кратных (7)
                    c = c + a; // сумирует числа кратные 7 между собой
                }
                a++;
            }
        } else {
            while (d <= a) {
                if (d % 7 == 0) { // кратность 7
                    b++; //хранит информацию о количестве кратных (7)
                    c = c + d;
                }
                d++;
            }
        }
        System.out.println(c);
    }

}
