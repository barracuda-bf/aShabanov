package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 12.04.2017.
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a = ckn.nextInt();
        int b = ckn.nextInt();
        int c = 1;
        if (a < b) {
            while (a <= b) {
                c = c * a;
                a++;
            }
        } else {
            while (b<=a) {
                c = c * b;
                b++;
            }
        }
        System.out.println(c);
    }
}
