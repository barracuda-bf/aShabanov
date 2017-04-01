package com.company.Lab5;

// не срабатывает оператор break;'

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int b;
        int a;
        double a1;
        double b2;
        Scanner x = new Scanner(System.in);
        System.out.println("radius kruga:");
        a = x.nextInt();
        if (a < 0) {
            System.out.println("radius ne moget bit otricatel'nim");
            //break;
                    }
        System.out.println("Storona kvadrata:");
        b = x.nextInt();
        if (b < 0) {
            System.out.println("storona kvadrata ne moget bit otricatel'nim");
                    }
        a1 = Math.PI*Math.pow(a,2);
        b2 = Math.pow(b,2);
        if (a1>b2){
            System.out.println("S kruga bolshe S kvadrata");
        } else {
            System.out.println("S kvadrata bolshe S kruga");
        }
    }
}
