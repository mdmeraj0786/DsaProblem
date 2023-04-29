
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if(number==2){
            System.out.println(number + " is Prime");
        }else{
            for(int i = 2; i <= number-1;i++){
                if(number % i ==0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println(+number + " is Prime");
            }else{
                System.out.println(+number + " is NotPrime");
            }
        }
    }
}
