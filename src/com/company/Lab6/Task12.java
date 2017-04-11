package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 09.04.2017.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int b = ckn.nextInt();
        int a = -10;
        if ((b <= a) || (b >= 10000)) {
            System.out.println("Error");
        } else {
            int c = 0;
            while (a <= b) {
                c = c + a;
                a++;
            }
            System.out.println(c);
        }

    }
}