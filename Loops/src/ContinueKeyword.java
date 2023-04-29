
import java.util.Scanner;

public class ContinueKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
