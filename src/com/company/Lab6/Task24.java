package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 19.04.2017.
 */
public class Task24 {
    public static void main(String[] args) {
        int n;
        int b = 0;
        int i1 = 1;
        System.out.println("Введите число:");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        //System.out.print("Число " + n + " делится на - " );
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                b++;
                System.out.print(i + " ");
            }
        }
    }
}

