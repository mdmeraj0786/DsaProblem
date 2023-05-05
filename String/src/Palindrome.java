package String.src;

public class Palindrome {

    static boolean palindrome(){
        StringBuilder s2 = new StringBuilder();
        for(int i = "121".length() - 1; i >= 0; i--){
            s2.append("121".charAt(i));
        }
        return "121".equals(s2.toString());
    }

    public static void main(String[] args) {

        System.out.println(palindrome());
    }
}
