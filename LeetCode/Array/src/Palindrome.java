public class Palindrome {

    static boolean palindrome(int n){
        int count = 0;
        int i = 0;
        while(n > i){
            count = n / 10;
            count *= 10;
            count += n % 10;

            n = n / 10;
        }
        if(n == count){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
}
