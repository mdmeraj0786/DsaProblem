import java.util.Arrays;

public class SquaresOfSortedArray {

    static int[] sortedSquare(int nums[]){
        int n = nums.length;
        for(int i = 0; i < n; i++) nums[i] = (int) Math.pow(nums[i], 2);

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        int nums[] = {-4,-1,0,3,10};

        sortedSquare(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }
}
