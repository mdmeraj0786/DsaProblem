
import java.util.Scanner;

public class swapFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //swap
        int temp = a;
         a = b;
         b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
