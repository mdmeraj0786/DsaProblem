package String.src;

public class ReversingString {
    public static void main(String[] args) {

       String s1 = "Meraj";
       String s2 = "";
       for(int i = s1.length() - 1; i >= 0; i--){
           s2 = s2 + s1.charAt(i);
       }
        System.out.println("Before reversing : "+s1);
        System.out.println("After reversing : "+s2);

        String a1 = "Meraj Seraj";
        String a2 = "";
        String sarr[] = a1.split(" ");
        for(int i = sarr.length - 1; i >= 0; i--){
            a2 = a2 + sarr[i] + " ";
        }
        System.out.println("Before reversing : "+a1);
        System.out.println("After reversing : "+a2);

        String b1 = "Meraj Seraj";
        String b2 = "";
        for(int i = a1.length() - 1; i >= 0; i--){
            b2 = b2 + b1.charAt(i);
        }
        System.out.println("Before reversing : "+b1);
        System.out.println("After reversing : "+b2);
    }
}