package Lab8_MASS;

import java.util.Scanner;

/**
 * Created by pro-8 on 05.05.2017.
 */
public class Lab1 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = ckn.nextLine();
        if (a.length()==0 ) {
            System.out.println("Исходная строка пуста");
            return;
        }
        int str = ckn.nextInt();
        String[] arr = a.split(" "); // делим строку на несколько частей разделенных " ";
        if ((arr.length <= str )||(str<0)){
            System.out.println("Число A должно быть в интервале [0, размер массива)");
            return;
        }
        String first = arr [str]; // элемент массива arr под номером str в переменную first
        System.out.println(first);

    }
}
