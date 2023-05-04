package String.src;

import java.sql.SQLOutput;

public class CapacityOfMutableString {
    public static void main(String[] args) {

        StringBuffer a1  = new StringBuffer("");
        System.out.println(a1.capacity());
        a1.append("abcdefghijklmnop");
        System.out.println(a1.capacity());
        a1.append("A");
        System.out.println(a1.capacity()); // how many you can add
        System.out.println(a1.length()); // how many character present

        System.out.println("\n");

        StringBuffer a2 = new StringBuffer("Sachin");
        System.out.println(a2);
        System.out.println(a2.capacity());
        System.out.println(a2.charAt(1));
        a2.setCharAt(1,'A');
        System.out.println(a2);

        System.out.println("\n");

        StringBuilder a3 = new StringBuilder(150);
        System.out.println(a3.capacity());
        a3.append("Java");
        System.out.println(a3);
        a3.trimToSize();
        System.out.println(a3.capacity());

        System.out.println("\n");

        StringBuilder a4 = new StringBuilder("Meraj Khan");
        System.out.println(a4);
        System.out.println(a4.reverse());
    }
}
