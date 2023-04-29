

public class Butterfly {
    public static void main(String[] args) {
        int n = 8;
            for (int i = 1; i <= n; i++) {
                if(i<=4){
                for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                }
                System.out.println();
                } else if (i>=4) {
                    for(int k = 1; k<=n-i+1;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
    }
}
