package com.company.Lab6;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a = ckn.nextInt();
        int i = 0;
        //int y; // позволяет следить за количеством символов в строке
        while (i < 15) {
            i++;  // увеличивает кол-во i
            if (i <= a) {
                System.out.print("#"); // вывод # на экран
            } else {
                System.out.print("."); // вывод . на экран
            }

        }
        }
    }

