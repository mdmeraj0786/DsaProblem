
import java.util.*;

public class LinearSearch {
    static int search(int[] arr,int key){
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 43, 34, 22, 53, 24, 63};
        System.out.println("Enter the value for searching : ");
        int key = sc.nextInt();

        int index = search(arr, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("element in an array index at :" + index);
        }
    }
}
