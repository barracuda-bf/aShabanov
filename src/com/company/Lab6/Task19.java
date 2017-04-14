package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 14.04.2017.
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a = ckn.nextInt();
        int i = 0;
        int i1 = 0; // позволяет следить за количеством символов в строке
        while (i < a) {
            System.out.print("#");
            i++;
            i1++;
            if (i1==20){
                System.out.println();
                i1=0; // обнуляется когда количество символов доходит до 20 (впремере)
            }
        }
    }
}

