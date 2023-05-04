public class PivotIndex {
    static int pivot(int[] arr){
        int n = arr.length;
        int leftSum = 0;
        int rightSum = 0;
        for (int j : arr) {
            rightSum += j;
        }
        for(int i = 0; i < n;i++){
            rightSum -= arr[i];
            if(leftSum == rightSum){
                return i;
            }else{
                leftSum += arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,7,3,6,5,6};
        System.out.println(pivot(arr));
    }
}
