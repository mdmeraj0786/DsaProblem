package String.src;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = new String("Md");
        s1.concat(" Meraj");
        System.out.println(s1);
        s1 = s1.concat(" Meraj");
        System.out.println(s1);

        String s3 = "Seraj";
        String  s4 = s3.concat(" Khan");
        String s5 = new String("Shahid");
        s5 = s5.concat(" Khan");

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        String a1 = "Meraj";
        String a2 = " Seraj " + "Sahid";

        System.out.println(a1+a2);

    }
}
