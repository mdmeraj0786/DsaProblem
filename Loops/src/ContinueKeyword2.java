// Display all numbers entered by user except multiples of 10

import java.util.Scanner;

public class ContinueKeyword2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        for(int i = 0;i<=number;i++) {
            if (number % 10 == 0) {
                continue;
            }
            System.out.println("your number is : "+number);
            break;
        }
    }
}
