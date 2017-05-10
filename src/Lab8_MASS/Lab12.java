package Lab8_MASS;

import java.util.Scanner;

/**
 * Created by pro-8 on 10.05.2017.
 */
public class Lab12 {
    public static void main(String[] args) {
        String a;
        Scanner x = new Scanner(System.in);
        a = x.next ();
        String  [] arr = new String [] {"a","b","c","d","e","f","g","h"};
        int i = 0;
        while (i<arr.length) {
            if (a.equals(arr [i])) {
                System.out.println(arr [i]+"+");
            } else{
                System.out.println(arr [i]);
            }
            i++;
        }
    }
}
