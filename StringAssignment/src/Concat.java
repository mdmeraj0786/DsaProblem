
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String student = sc.nextLine();
        student = student.concat(" Khan");

        System.out.println("Enter the name : ");
        String firstName = new String(sc.nextLine());
        String lastName = firstName + " kumar";

        System.out.println(student);
        System.out.println(lastName);

    }
}
