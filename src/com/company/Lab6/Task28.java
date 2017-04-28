package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 19.04.2017.
 */
public class Task28 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        System.out.println("Выводимый символ");
        String a = ckn.next();
        System.out.println("Ширина");
        int b = ckn.nextInt();
        System.out.println("Высота");
        int c = ckn.nextInt();
        //int b1 = 0;
        //int b2 = 0;
        int i = 0;
        int j = 0;
        //int j1 = 0;
        if ((0 > c) || (b < 0)) {
            System.out.println("Error");
            return;
        }
        for (i = 0; i < c; ++i) {
            //System.out.println();
            for (j = 0; j < b; ++j) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
