package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 27.03.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        //System.out.println();
        double a;
        double b;
        Scanner x = new Scanner(System.in);
        a = x.nextDouble();
        if (a <=0) { // проверка данных
            System.out.println("error");
            return; //прекращение работы метода main
        }
        b = 6*Math.pow(a,2) ;
        System.out.println(b);
    }
}
