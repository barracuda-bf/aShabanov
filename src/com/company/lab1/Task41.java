package com.company.lab1;

import java.util.Scanner;

/**
 * Created by наш on 23.03.2017.
 */
public class Task41 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);// создаем сканер консоли для считывания
        System.out.println("дополните фразу: \"Програмистом быть:\"");
        String aa = s.next();

        System.out.println("Програмистом быть " + aa + "!");
    }
}
