package com.company.Lab6;

import java.util.Scanner;

/**
 * Created by наш on 09.04.2017.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        int i = ckn.nextInt();
        if ((i<=-100)||(i>=500)){
            System.out.println("Error");
        } else {
            int c=0;
                while (i<=500){
            c = c + i;
            i++;
        }
        System.out.println(c);
    }
}
}
