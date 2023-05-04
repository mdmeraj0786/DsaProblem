
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = new String(sc.nextLine());
        String s2 = sc.nextLine();
        String s3 = "Meraj";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2==s3);
    }
}
