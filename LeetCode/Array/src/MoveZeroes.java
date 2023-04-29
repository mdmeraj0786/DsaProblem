public class MoveZeroes {

    static void moveZeroes(int arr[]){
        int n =  arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }

        while(count < n){
            arr[count] = 0;
            count++;
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
