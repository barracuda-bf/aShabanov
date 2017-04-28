package com.company.Lab7;

import java.util.Scanner;

/**
 * Created by pro-8 on 28.04.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = "abcdefwxyz";
        int str = ckn.nextInt();
        int str1 = ckn.nextInt();
        int b = a.indexOf(str);

        if ((str < 0) || (str > b)) {
            System.out.println("Значение A должно быть в интервале [0,длина строки)");
            return;
        }
        if ((str1 < 0) || (str1 > b)) {
            System.out.println("Значение B должно быть в интервале [0,длина строки)");
            return;
        }
        String c = a.substring(str, str1 + 1);
        System.out.println(c);
    }
}
