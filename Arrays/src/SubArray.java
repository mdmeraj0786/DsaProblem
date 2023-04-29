public class SubArray {

    static void subArray(int arr[]) {
        int start;
        for (start = 0; start < arr.length; start++) {
            int end;
            for (end = start + 1; end < arr.length; end++) {
                for (int k = start; k < end; k++) {
                    System.out.print( arr[k] + "," );
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};

        subArray(arr);
    }
}
