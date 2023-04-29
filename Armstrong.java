import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        for (int i = 0 ;i<n; i++){
            int r = n % 10;
            m += Math.pow(r,r);

            r = n / 10;
        }
        System.out.println(m);
    }
}
