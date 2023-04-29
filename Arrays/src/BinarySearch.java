
import java.util.*;

public class BinarySearch {
    static int search(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {45,34,24,14,63,63,22,56,24,7,77,3};
        int key = sc.nextInt();
        System.out.println(search(arr,key));
    }
}
