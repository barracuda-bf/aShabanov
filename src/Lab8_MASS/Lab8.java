package Lab8_MASS;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by pro-8 on 10.05.2017.
 */
public class Lab8 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = ckn.nextLine(); // 1 2 3 4 5 6 7 8 9
        //int b = ckn.nextInt();
        String[] arr = a.split(" ");
        int i = arr.length-1;
        String t = arr[i];
        while (i>0)
        {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[0] = t;
        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
