
import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line : ");
        int line = sc.nextInt();
        char ch = 'a';
        for(int i = 1;i<= line;i++){
            for(int j = 1;j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}