package com.company.Lab7;

import java.util.Scanner;

/**
 * Created by наш on 05.05.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = "abcdefwxyz";
        String str = ckn.next();
        String str1 = ckn.next();
        int b = a.indexOf(str);
        int b1 = a.indexOf(str1);
        String c;
        if (b < 0) {
            System.out.println("Значение CA отсутствует в строке");
            return;
        }
        if (b1 < 0) {
            System.out.println("Значение CA отсутствует в строке");
            return;
        }
        if (b < b1) {
            c = a.substring(b, b1);
        } else {
            c = a.substring(b1, b);
        }
        System.out.println(c);
    }
}
