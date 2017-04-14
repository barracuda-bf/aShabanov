package com.company.Lab6;

import java.util.Scanner;

public class Task211 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a = ckn.nextInt();
        int i = 0; // вывод изначального значения
        //int y; // позволяет следить за количеством символов в строке
        while (i < a) {
            System.out.print("#"); // вывод #
            i++;
    }
        while (i<15){
            System.out.print("."); // вывод .
            i++;
        }
    }
}
