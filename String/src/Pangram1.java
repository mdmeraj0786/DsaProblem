package String.src;

public class Pangram1 {


    public static void main(String[] args) {

        boolean flag = false;

        String s1 = "The Quick Brown Fox Jumps Over Lazy Dog";

        s1 = s1.replace(" ", "");
        s1 = s1.toLowerCase();

        char[] ch = s1.toCharArray();
        int arr[] = new int[26];

        for(int i = 0; i < ch.length; i++){
            arr[ch[i] - 97]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i]==0){
                System.out.println("It is not panagram");
                flag = true;
            }
        }

        if(flag == false){
            System.out.println("Its panagram");
        }
    }
}
