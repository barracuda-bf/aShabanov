package Lab8_MASS;

import java.util.Scanner;

/**
 * Created by наш on 07.05.2017.
 */
public class Lab3 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String str = ckn.nextLine();
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        double sum = 0;
        for (int i1 = 0; i1 < strArr.length; i1++) {
            sum = sum + numArr[i1];
        }
        double sred = sum/strArr.length;
        System.out.format("%.1f%n",sred);
    }
}


