package com.company.Lab5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by наш on 01.04.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double a1,a2,b1,b2,c1,c2;
        Scanner x = new Scanner(System.in);
        a = x.nextDouble();
        b = x.nextDouble();
        c = x.nextDouble();
        if (a>0){
            a1 = Math.pow(a,2);
            System.out.println(a1);
        } else {
            a2=a;
            System.out.println(a2);
        }
        if (b>0){
            b1 = Math.pow(b,2);
            System.out.println(b1);
            } else {
            b2 = b;
            System.out.println(b2);
        }
        if (c>0) {
            c1 = Math.pow(c,2);
            System.out.println(c1);
        } else {
            c2 = c;
            System.out.println(c2);
        }

    }

}
