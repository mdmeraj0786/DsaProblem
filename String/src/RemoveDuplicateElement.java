package String.src;

public class RemoveDuplicateElement {
    public static void main(String[] args) {

       String s1 = "abbc";
       String s2 = "";

       for(int i = 0; i < s1.length();i++){
           for(int j = i+1; j < s1.length(); j++){
               if(s1.charAt(i) != s1.charAt(j)){
                   s2 = s2 + s1.charAt(j);
               }
           }
       }
        System.out.println(s2);
    }
}
