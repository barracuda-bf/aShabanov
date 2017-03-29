package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task29 {
    public static void main(String[] args) {
        int a;
        System.out.println("Celekt x:");
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        double b = (Math.sqrt(a+1)+Math.sqrt(a-1))/(2*Math.sqrt(a));
        System.out.format("%.4f%n", b);
    }
}
