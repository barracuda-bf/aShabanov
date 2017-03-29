package com.company.lab2;

import javax.swing.text.MutableAttributeSet;
import java.util.Scanner;

/**
 * Created by наш on 29.03.2017.
 */
public class Task34 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner skan = new Scanner(System.in);
        a = skan.nextInt();
        b = skan.nextInt();
        double c = a*Math.PI/180;
        double d = b*Math.PI/180;
        double e = 3* Math.sin(2*c)*Math.cos(3*d);
        System.out.format("%.4f%n",e);
    }
}
