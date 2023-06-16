public class ImmutableString {
    public static void main(String[] args) {

        String s1 = "Nike";
        String s2 = "Nikeyn";
        System.out.println(s1 == s2);

        String s3 = new String("Rahul");
        String s4 = new String("Rahul");
        System.out.println(s3 == s4);

    }
}
