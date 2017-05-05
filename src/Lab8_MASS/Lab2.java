package Lab8_MASS;

import java.util.Scanner;

/**
 * Created by pro-8 on 05.05.2017.
 */
public class Lab2 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = ckn.nextLine();
        String[] arr = a.split(" ");
        int a1 = arr.length - 1;
        while (a1 >= 0) {
            System.out.print(arr[a1] + "(" + a1+")" + " ");
            a1--;
        }

    }
}