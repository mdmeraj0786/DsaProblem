
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of star line : ");
        int line = sc.nextInt();
        for(int i = 0;i < line; i++){
            for(int j = 0; j <= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
