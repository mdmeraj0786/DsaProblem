import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String student = sc.nextLine();
        student = student.concat(" Khan");
        System.out.println(student);
    }
}
