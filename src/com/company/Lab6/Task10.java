package com.company.Lab6;

/**
 * Created by pro-10 on 07.04.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 100;
        sum = sum + 101;
        sum = sum + 102;
        sum = sum + 103;
        sum = sum + 104;
        System.out.println(sum);

        sum=0;
        int i = 100;
        sum = sum + i;
        i++;
        sum = sum + i;
        i++;
        sum = sum + i;
        i++;
        sum = sum + i;
        i++;
        sum = sum + i;
        i++;
        System.out.println(sum);

        sum=0;
        i=100;
        while (i<=500){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
