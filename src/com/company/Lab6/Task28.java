package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 19.04.2017.
 */
public class Task28 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        System.out.println("Выводимый символ");
        String a = ckn.next();
        System.out.println("Ширина");
        int b = ckn.nextInt();
        System.out.println("Высота");
        int c = ckn.nextInt();
        //int b1 = 0;
        //int b2 = 0;
        int i = 0;
        int j = 0;
        //int j1 = 0;
        if ((0 > c) || (b < 0)) {
            System.out.println("Error");
            return;
        }
        for (i = 0; i < c; ++i, System.out.println())
            for (j = 0; j < b; ++j)
                System.out.print(a);
    }
}
/*public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Vicota:");
        a = sc.nextInt();
        System.out.print("Shirina:");
        b = sc.nextInt();
        int i = 0;
        int i1 = 0; // позволяет следить за количеством символов в строке
        while (i <= b) {
                System.out.print("#");
                i++;
                i1++;
                if (i1 == b) {
                    System.out.println();
                    i1 = 0; // обнуляется когда количество символов доходит до 20 (впремере)
                }
                while (i<=a){
                    i++;

                }
            }

        }
    }*/
