package String.src;

public class ReversingString1 {
    public static void main(String[] args) {

        String name = "Meraj";
        String reverseName = "";

        for(int i = name.length() - 1; i >= 0; i--){
            reverseName += name.charAt(i);
        }
        System.out.println(reverseName + " \n ");


        String str1 = new String("Meraj Bhai");
        String str2 = "";

        String sarr[] = str1.split(" ");
        for(int i = sarr.length - 1; i>=0 ; i--){
            str2 = str2 + sarr[i] + " ";
        }
        System.out.println(str2 + "\n");

       String s1 = "Meraj Bhai";
       String s2 = "";

        String sarr1[] = s1.split(" ");

       for(int i = s1.length() - 1; i>=0 ; i--){
           s2 = s2 + s1.charAt(i);
       }
        System.out.println(s2); //iahB jareM
    }
}
