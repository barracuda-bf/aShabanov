package com.company.Lab5;
// есть ошибка в условии задачи, т.к. 1 решение не верное (.) не лежит в области координат
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Xt,Yt,Xp,Yp,H,W;
        System.out.println("Select Xt:");
        Xt = scn.nextInt ();// c -Xt
        System.out.println("Select Yt:");
        Yt = scn.nextInt ();//Yt
        System.out.println("Select Xp:");
        Xp = scn.nextInt ();
        System.out.println("Select Yp:");
        Yp = scn.nextInt ();
        System.out.println("Select height(H):");
        H = scn.nextInt ();
        System.out.println("Select width(W):");
        W = scn.nextInt ();
        if ((H<0)&&(W<0)) {
            System.out.println("error");
               }
        if ((Xp<Xt)&&(Xp+W>Xt)) {
            if ((Yp<Yt)&&(Yp+H>Yp)){
                System.out.println("yes");
            }
        }else {
            System.out.println("no");
        }


    }
}
