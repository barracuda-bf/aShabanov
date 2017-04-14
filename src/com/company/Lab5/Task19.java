package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by наш on 13.04.2017.
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        System.out.println("Введите занчение от -10 до 100");
        int a = ckn.nextInt ();
        if ((a<=-10)||(a>=100)) {
            System.out.println("Error");
            return;
        } else if (a%2==0) {
            System.out.println(a+"\"ой\"");
        } else {
            System.out.println(a+"\"ый\"");
        }
    }
}
