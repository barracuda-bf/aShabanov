package Lab8_MASS;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = ckn.nextLine();
        int b = ckn.nextInt();
        int e = ckn.nextInt();
        String[] arr = a.split(" ");

        System.out.println(arr [b]);

       int g = b;
        while (g<=e){
            System.out.println(g);
            g++;
        }
    }
}
