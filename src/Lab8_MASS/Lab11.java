package Lab8_MASS;

import java.util.Scanner;

/**
 * Created by pro-8 on 10.05.2017.
 */
public class Lab11 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String str = ckn.nextLine();
        int b = ckn.nextInt();
        String arr[] = str.split(" ");
        int num[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        int count = 0;
        int chis = 0;
        while (chis <= arr.length-1)
        {
            if (num[b] > num[chis]) {
            count++;
            }
            chis++;
        }
        System.out.print(count);
    }
}