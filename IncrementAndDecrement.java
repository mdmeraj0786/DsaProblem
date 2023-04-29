public class IncrementAndDecrement {
    public static void main(String[] args) {

        int a = 5;

        int b = a++ + ++a + --a;

        int c = a++ + ++a + ++a + a++ + --a + a--;

        System.out.println(b);
        System.out.println(c);
    }
}
