package com.company.Lab5;

import java.util.Scanner;

/*Даны три действительных числа. Вывести только те числа, которые принадлежат интервалу (-3;5) исключая границы.
 */
public class Task14 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner x = new Scanner(System.in);
        System.out.println("Selekt a:");
        a = x.nextDouble();
        System.out.println("Selekt b:");
        b = x.nextDouble();
        System.out.println("Selekt c");
        c = x.nextDouble();
        if (-3 <= a && a <= 5) {
            System.out.println(a);
        }
        if (-3 <= b && b <= 5) {
            System.out.println(b);
        }
        if (-3 <= c && c <= 5) {
            System.out.println(c);
        }
    }
}
