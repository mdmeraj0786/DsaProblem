
import java.util.Scanner;

public class All {

    //swap
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }

    //product
    static int product(int a,int b){
        int multiply = a * b;
        return multiply;
    }

    //factorial
    static int factorial(int a){

        int factorialNumber = 1;
        if(a==0){
            return a;
        }
        for(int i = 1;i <= a;i++){
            factorialNumber *= i;
        }
        return factorialNumber;
    }

    //binomial Coefficient
    static int binomialCoefficient(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bc = n_fact/(r_fact*nmr_fact);
        return bc;
    }

   // check prime number
    static boolean checkPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i < n;i++){
            if(n % i == 0){
                isPrime =false;
                break;
            }
        }
        return isPrime;
    }

    //check prime number
    static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //range of prime number
    static void rangeOfPrimeNumber(int n){
        for(int i = 2; i<n ;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    //Convert binary to decimal
    static int binaryToDecimal(int binaryNumber){
        int decimalNumber = 0;
        int pow = 0;
        while(binaryNumber>0){
            int lastDigit = binaryNumber % 10;
            decimalNumber = decimalNumber + lastDigit * (int) Math.pow(2,pow);
            pow++;
            binaryNumber  = binaryNumber / 10;
        }
        return decimalNumber;
    }

    //convert decimal to binary number
    static int decimalToBinary(int decimalNumber){
        int binaryNumber = 0;
        int pow = 0;
        while(decimalNumber>0){
            int rem = decimalNumber % 2 ;
            binaryNumber = binaryNumber + rem * (int) Math.pow(10,pow);
            pow++;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("a = ");
//        int a = sc.nextInt();
//        System.out.print("b = ");
//        int b = sc.nextInt();

//        swap(a,b);

//        System.out.println("multiply = " +product(a,b));

//        System.out.println(factorial(a));

//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        System.out.println(binomialCoefficient(n,r));

//        int n = sc.nextInt();
//        System.out.println(checkPrime(n));

//        int n = sc.nextInt();
//        System.out.println(isPrime(n));

//        int n = sc.nextInt();
//        rangeOfPrimeNumber(n);

        System.out.println("enter the decimal number ");
        int decimalNumber = sc.nextInt();
        System.out.println(decimalToBinary(decimalNumber));


    }

}
