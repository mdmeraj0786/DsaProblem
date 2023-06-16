public class SecondLargest1 {

    static int secondLargest(int arr[], int n){
        int largest = arr[0];
        for (int i = 0; i < n; i++){
            if(largest <= arr[i]){
                largest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] >= secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {

        int arr[] = {1,3,9,4,9,5,4};
        int n = arr.length;
        System.out.println(secondLargest(arr,n));
    }
}
