package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 28.03.2017.
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите скорость автомобиля А:");
        int a;
        a = x.nextInt();
        System.out.println("Введите скорость автомобиля В:");
        int b;
        b = x.nextInt();
        System.out.println("Введите растояния между автомобилями:");
        double c;
        c = x.nextDouble();
        double d = c/(a+b);

        System.out.print("Автомобили встретятся через ");
        System.out.format("%.4f",d);
        System.out.println(" часов");

    }

}
