package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by pro-10 on 07.04.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int a;
        int b;
        a = ckn.nextInt();
        b = ckn.nextInt();
        while (a<=b){
            System.out.println(a);
            a++;
        }
    }
}
