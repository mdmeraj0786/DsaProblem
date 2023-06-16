import java.sql.SQLOutput;

public class CompareString {
    public static void main(String[] args) {

        String s1 = "Meraj";
        String s2 = "Seraj";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Meraj");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        String s4 = "Meraj";
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
    }
}
