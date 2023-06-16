package Gfg.src;

public class LeadersArray {

    static int leaderArray(int arr[],int n){
        int j = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i]){

            }
        }
        return n;
    }
    public static void main(String[] args) {

        int arr[] = {16,17,4,3,5,2};

        int n = arr.length;

        leaderArray(arr,n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
