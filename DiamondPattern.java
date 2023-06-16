
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int n = 3;
        for(int i = 1; i <= n;i++ ){
            //space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 1; k <= (2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1;i-- ){
            //space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 1; k <= (2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
