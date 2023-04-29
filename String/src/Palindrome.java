package String.src;

import java.util.Scanner;

public class Palindrome {
    static boolean palindrome(String s1){
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            s2 = s2 + s1.charAt(i);
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        String s1 = sc.nextLine();
        System.out.println(palindrome(s1));
    }
}
