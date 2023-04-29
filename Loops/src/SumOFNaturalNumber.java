
//print the sum of natural number.
import java.util.Scanner;

public class SumOFNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum is : " + sum);
    }
}
