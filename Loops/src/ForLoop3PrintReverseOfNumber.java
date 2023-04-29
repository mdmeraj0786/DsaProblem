
import java.util.Scanner;

public class ForLoop3PrintReverseOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int number = sc.nextInt();

        int lastDigit;
        while(number > 0){
            lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10;
        }
        System.out.println();
    }
}
