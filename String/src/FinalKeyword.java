package String.src;

public class FinalKeyword {
    public static void main(String[] args) {
//        final int a = 10;
//        a = 12;
//        System.out.println(a);

        String s1 = new String("Meraj");
        s1 = s1.concat(" Khan");
        System.out.println(s1);

        final StringBuffer s2 = new StringBuffer("Seraj");
        s2.append(" Khan");
        System.out.println(s2);

//        s2 = new StringBuffer("Shahid");
//        System.out.println(s2);
    }
}
