package com.company.Lab7;

import java.util.Scanner;

/**
 * Created by pro-8 on 28.04.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = "abcdefwxyz";
        String str = ckn.next();
        int b = a.indexOf(str);
        if (b>0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
