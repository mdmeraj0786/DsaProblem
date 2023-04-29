package String.src;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st the String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the 2nd String : ");
        String s2 = sc.nextLine();

        s1 = s1.replace(" ","");
        s2 = s2.replace(" ","");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("It is an anagram");
        }else{
            System.out.println("It is not an anagram");
        }
    }
}
