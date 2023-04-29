import java.util.*;

public class EvenSum {

    static void evenSum(int[] arr) {
        int counter;
        counter = 0;
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
                System.out.print(arr[i] + " ");
                counter++;
            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(counter);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,6};
        evenSum(arr);

    }
}
