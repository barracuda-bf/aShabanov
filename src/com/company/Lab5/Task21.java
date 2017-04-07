package com.company.Lab5;
// есть ошибка в условии задачи, т.к. 1 решение не верное (.) не лежит в области координат
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("Select Xt:");
        c = scn.nextInt ();// c -Xt
        System.out.println("Select Yt:");
        d = scn.nextInt ();//Yt
        System.out.println("Select Xp:");
        a = scn.nextInt ();
        System.out.println("Select Yp:");
        b = scn.nextInt ();
        System.out.println("Select height(H):");
        e = scn.nextInt ();
        System.out.println("Select width(W):");
        f = scn.nextInt ();
        int e1 = e * -1;
        if ((e<0)&&(f<0)) {
            System.out.println("Введены неверные данные!");
        } else if (e==f){
            System.out.println("Введены неверные данные!");
        }

        if ((a==0)&&(b==0)) {e = e1;}
        else {e = e; }
        if ((a<=c)&&(c<=e)&&(e1<=d)&&(d<=b)){
            System.out.println("Точка внутри координат");
        } else {
            System.out.println("Точка не внутри координат");
        }
    }
}
