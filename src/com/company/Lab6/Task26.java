package com.company.Lab6;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int b = 0;
        int a = ckn.nextInt();
        if ((a<0)||(a>20)){
            System.out.println("Error");
            return;
        }

        while (b<a) {
            System.out.print("a");
            b++;
        }
        b=0; // счетчик для следующего цикла, следующий цикл начнет с 0
        System.out.println();
        while (b<a) {
            System.out.print("b");
            b++;

        }
        b=0;
        System.out.println();
        while (b<a) {
            System.out.print("c");
            b++;
        }
        b=0;
        System.out.println();
        while (b<a) {
            System.out.print("d");
            b++;
        }
        b=0;
        System.out.println();
        while (b<a) {
            System.out.print("e");
            b++;
        }
        b=0;
        System.out.println();
        while (b<a) {
            System.out.print("f");
            b++;
        }
        b=0;
        System.out.println();
        while (b<a) {
            System.out.print("g");
            b++;
        }
        b=0;
        System.out.println();
        while (b<a) {
            System.out.print("h");
            b++;
        }
        b=0;
        System.out.println();
    }

}
