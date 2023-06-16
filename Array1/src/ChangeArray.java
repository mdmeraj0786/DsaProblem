public class ChangeArray {

    static void displayArray(int[] arr, int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void change_Array(int arr[],int n){
        for (int i = 0; i < n; i++){
            arr[i] = 0;
        }
    }


    public static void main(String[] args) {

        int a = 15;
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        change_Array(arr,n);
        displayArray(arr,n);
    }
}
