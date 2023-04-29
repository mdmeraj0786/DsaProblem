
import java.util.Scanner;

public class ForLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int lastDigit;
        int reverseNumber = 0;
        while(number>0){
            lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reverseNumber);
    }
}
