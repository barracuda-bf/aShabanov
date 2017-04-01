package com.company.Lab5;

import java.util.Scanner;

/**
 * Created by наш on 01.04.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        int b;
        double a;
        Scanner x = new Scanner(System.in);
        System.out.println("Int V1 km/h:");
        a = x.nextDouble();
        System.out.println("Int V2 m/s:");
        b = x.nextInt ();
        if (a<0) {
            System.out.println("Сообщение об ошибке");
        }
        if (b<0) {
            System.out.println("Скорость не может быть отрицательной");
        }
        if (a/3.6<=b){
            System.out.println("V2(м/с) больше V1(км/ч)");
        } else {
            System.out.println( "V1 (км/ч) больше V2 (м/с)" );
        }

    }
}
