
import java.util.*;
public class CopyArray {

    static void display(int arr[], int n){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,2,2,4,1};
        int n = arr.length;
      //  display(arr,n);

        System.out.println();

        int arr1[] = arr;
        arr1[1] = 10;
        arr1[2] = 20;
        display(arr,n);
        System.out.println();
        display(arr1,n);
    }
}
