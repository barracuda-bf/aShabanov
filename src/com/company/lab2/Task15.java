package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 28.03.2017.
 */
public class Task15 {
    public static void main(String[] args) {
        int a;
        double b = 1.8;
        int c = 32;
        Scanner a1 =new Scanner(System.in);
        System.out.println();
        a = a1.nextInt();
        double d = a*b+c;
        System.out.print("градусы по фаренгейту равны ");
        System.out.format("%.2f%n",d);



    }
}
