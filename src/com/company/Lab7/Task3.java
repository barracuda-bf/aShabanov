package com.company.Lab7;

import java.util.Scanner;

/**
 * Created by pro-8 on 28.04.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = "abcdefwxyz";
        String str = ckn.next();
        String str1 = ckn.next();
        int b = a.indexOf(str);
        int b1 = a.indexOf(str1);
        if ((b < 0 )&&(b1<0)) {
            System.out.println("Error");
            return;
        }
        int d;
        if (b<b1){
            d = b1-b-1;
        }else {
            d = b-b1-1;
        }
        System.out.println(d);
    }
}
