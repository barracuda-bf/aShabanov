package com.company.lab1;

import java.util.Scanner;

/*Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями. $X на введенное значение x. $Y на введенное значение y.
- INSERT INTO points (x, y) VALUES ('$X', '$Y');
 */
public class Task10 {
    public static void main(String[] args) {
        //можно вводить только числовые сзанчения
        System.out.println ("INTO point x:");
        Scanner a1 = new Scanner(System.in); // Сканер числовой
        int ss = a1.nextInt(); // Строка для сичтывания числового сканера
        System.out.println ("INTO poitn y:");
        //Scaner a2 = new Scaner (System.in); - как правельно создовать 2й сканер???
        //int sss = a2.nextInt ();
        int sss = a1.nextInt();
        System.out.print ("INSERT INTO points (x, y) VALUES ('"+ ss +"','"+sss+"');");





    }

}
