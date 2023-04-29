import java.util.ArrayList;

public class PlusOne {
    static int[] plusOne(int[] arr){
        int n = arr.length;
        for(int i = n-1;i >= 0; i--){
            if(arr[i] != 9){
                arr[i]++;
                break;
            }else{
                arr[i] = 0;
            }
        }

        if(arr[0] == 0){
            int newArr[] = new int[n+1];
            newArr[0] = 1;
            return newArr;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int n = arr.length;

        plusOne(arr);

        //printing array
        for(int i = 0;i < n;i++){
            System.out.println(arr[i]);
        }
    }
}
