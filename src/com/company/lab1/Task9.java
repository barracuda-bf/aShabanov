package com.company.lab1;

import java.util.Scanner;

/*Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями. $ID на введенное значение id.
- SELECT first_name, last_name, group FROM students WHERE id = '$ID';
1)   123456789
2)   fa93f
 */
public class Task9 {
    public static void main(String[] args){
        //System.out.println ();
        Scanner s = new Scanner(System.in); // Создание сканера для считывания строки
        String ss = s.next(); // считываем введеную строку буквенно численную
        String a = "SELEKT first_name, last_name,";
        String b =  "group FROM";
        String c = "Student WHERE id=";
        System.out.println (a + b + c + "'"+ss+"'");
    }



}
