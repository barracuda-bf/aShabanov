package com.company.lab1;

import java.util.Scanner;

/*
Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями.
<circle cx="$CX" cy="$CY" r="$R" fill="$FILL"/>
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println ("cx:");
        Scanner a1 = new Scanner(System.in); // Сканер числовой
        int a = a1.nextInt(); // Строка для сичтывания числового сканера
        System.out.println ("cy:");
        int b = a1.nextInt();
        System.out.println ("r:");
        int c = a1.nextInt();
        //Scanner a2 = new Scanner(System.in);// создаем сканер консоли для считывания
        System.out.println ("fill:");
        String d = a1.next();
        System.out.print ("<circle cx=\""+ a +"\" cy=\""+b+"\" r=\""+c+"\" fill="); //почему не получается соеденить в одну строчку вывод числовых и буквенных симвов????
        System.out.println  ("\""+d+"\"/>");
    }
}
