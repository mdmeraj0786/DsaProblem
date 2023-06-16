import java.util.Arrays;

public class SecondLargest {
    static int secondLargest(int a[], int n){
        Arrays.sort(a);
        int max = a[n-1];
        for(int i = n-2; i>=0; i--){
            if(a[i] != max){
                int j = a[i];
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {2,3,5,8,7,9};
        int n = a.length;
        System.out.println(secondLargest(a,n));
    }
}
