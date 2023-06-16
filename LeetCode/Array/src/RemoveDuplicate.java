public class RemoveDuplicate {
    public static void main(String[] args) {

       int[] nums = {1,1,2,3,3,5,5,6};
       int i = 1;
       for(int j = 0; j < nums.length; j++){
           if(nums[i] != nums[j]){
               i++;
               nums[i] = nums[j];
           }
       }
        System.out.println(i);
    }
}
