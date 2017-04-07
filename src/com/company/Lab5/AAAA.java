package com.company.Lab5;

/**
 * Created by наш on 03.04.2017.
 */
public class AAAA {
    public static void main(String args[]){
    final int a = 5;
    final int b = 155;
    int c = (int)(a + Math.random()*(b-a+1));
    if(c >= 35 && c <= 150){
        System.out.println("Число " + c + " содержится в интервале (35,150)");
    }
    else{
        System.out.println("Число " + c + " не содержится в интервале (35,150)");
    }
}
}
