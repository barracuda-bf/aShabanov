package com.company.Lab7;

import java.util.Scanner;

/**
 * Created by наш on 05.05.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = "abcdacadbacdaabaadc";
        System.out.print("ввести 2 символа:");
        String str = ckn.next();
        int c1 = str.length();
        if (c1!=2) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }
        int b1 = a.indexOf(str);
        int b2 = a.indexOf(str, b1+1);
                // как добавить условие, чтобы выводился только первый вариант, исключая второй..
        System.out.println(b1 + " " + b2);
    }
}
