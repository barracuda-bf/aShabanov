package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 28.03.2017.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("select a:");
        int a;
        a = x.nextInt();
        if (a<0){
            System.out.println("Error");
            return;
        }
        double c = Math.sqrt(a);
        System.out.format("%.4f%n", c);
    }
}
