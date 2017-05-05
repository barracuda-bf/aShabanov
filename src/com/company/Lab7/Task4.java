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

        int b1 = a.indexOf(str);
        int b11 = a.lastIndexOf(str);
        if ((b1 < 0 )&&(b1<0)) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }else if (b1 == 0) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }
        // как добавить условие, чтобы выводился только первый вариант, исключая второй..
        System.out.println(b1+" "+b11);
    }
}
