package Lab8_MASS;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner ckn = new Scanner(System.in);
        String a = ckn.nextLine(); // 1 2 3 4 5 6 7 8 9
        int b = ckn.nextInt();     // 0 1 2 3 4 5 6 7 8
        int e = ckn.nextInt();
        String[] arr = a.split(" ");
        if ((arr.length <= b )||(b<0)){
            System.out.println("Число B должно быть в интервале [0, размер массива)");
            return;
        } else if ((arr.length <= e )||(e<0)){
                System.out.println("Число E должно быть в интервале [0, размер массива)");
                return;
        }
        String f1 = arr [b];
        String f2 = arr [e];
        if (b<=e) {
            while (b <= e) {
                System.out.print(arr[b] + " ");
                b++;
            }
        } else {
                while (e<=b){
                    System.out.print(arr [e]+" ");
                    e++;
            }
        }
    }
}
