
import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int arr[],int n){
        for(int i = 0; i < n-1;i++){
            for(int j = 0 ; j< n-i-1; j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array is : ");
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n ;i++){
            System.out.println("Enter the " +i + " element");
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr,n);

    }
}
