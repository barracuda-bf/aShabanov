package Lab8_MASS;

import java.util.Scanner;

/**
 * Created by pro-8 on 10.05.2017.
 */
public class Lab6 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = ckn.nextLine(); // 1 2 3 4 5 6 7 8 9
        int b = ckn.nextInt();     // 0 1 2 3 4 5 6 7 8
        int e = ckn.nextInt();
        String[] arr = a.split(" ");
        String t = arr[b];
        arr [b] = arr [e];
        arr [e] = t;
        int i = 0;
        while   (i<arr.length) {
            System.out.print (arr [i]+" ");
            i++;
        }


    }

}
