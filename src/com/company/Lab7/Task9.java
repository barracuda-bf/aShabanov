package com.company.Lab7;

import java.util.Scanner;

/**
 * Created by pro-8 on 28.04.2017.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String str = ckn.next();
        if (str.startsWith("s")) {
            System.out.print (str.toLowerCase());
            return;
        }
        if (str.startsWith("U")) {
            System.out.print (str.toUpperCase());
            return;
        }
        System.out.println(str);
    }
}
