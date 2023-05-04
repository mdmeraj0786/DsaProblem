package String.src;

public class MutableString {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Virat");
        System.out.println(s1);
        s1.append(" Kohli");
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("Meraj");
        s2.append(" Khan");
        System.out.println(s2);
    }
}
