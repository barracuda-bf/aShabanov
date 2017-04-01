package com.company.Lab5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int b;
        int a;
        double a1;
        double b1;
        Scanner x = new Scanner(System.in);
        System.out.println("VVedite Sc:");
        a = x.nextInt();
        if (a < 0) {
            System.out.println("Error1");
            //break;
        }
        System.out.println("VVedite Ss:");
        b = x.nextInt();
        if (b < 0) {
            System.out.println("Error2");
        }
        a1 = 2 * Math.sqrt(a/Math.PI);
        b1 = Math.sqrt(b);
        if (a1<=b1){
            System.out.println("Krug pomestitsya v KVADRAT");
        }else {
            System.out.println("Krug ne pomestitsya v KVADRAT");
        }

    }
}