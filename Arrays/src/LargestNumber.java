public class LargestNumber {
    static int largest(int[] arr){
        int largestNumber = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++) {
            if (largestNumber < arr[i]) {
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }
    public static void main(String[] args) {
        int[] arr = {4,64,92,83,94,4,82,53,44};
        System.out.println("largest number is anb array is : " +largest(arr));
    }
}
