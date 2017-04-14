package com.company.Lab6;

public class Task23 {
    public static void main(String[] args) {
        int a = 100; // ограничыения
        int b = 0; // изначальное количество
        while (a <= 1000) {
            if (a%13==0) { // кратность 13
                System.out.print("+");
                b++; //хранит информацию о количестве кратных (13)
            }
            System.out.print(a + " ");
            a++;
         }
        System.out.println(b); // вывод общего количества переменных
    }
}
