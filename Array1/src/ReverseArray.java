
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = {2,6,2,1,4,23};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = n-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
