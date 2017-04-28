package com.company.Lab6;

import java.util.Scanner;


public class Task31 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        System.out.print("Символ:");
        String d = ckn.next();
        System.out.print("Количество:");
        int t = ckn.nextInt();
        if (t<0) {
            System.out.println("Error");
            return;
        }
        String s = "";
        int i = 0;
        while (i < t) {
            s += d;
            System.out.println(s);
            i++;
        }
    }
}

