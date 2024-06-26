package ARRAY;

public class Subarr_MAxSum_Kadnes {
    public static void kadnes(int nums[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i = 0; i<nums.length; i++){
            currsum = currsum + nums[i];
            
            if (currsum > maxsum) {
                maxsum = currsum;
            }

            if(currsum < 0){
                currsum = 0;
            }
            //maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("Our Max subarray sum is " + maxsum);
    }

    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, 1, -2, 1,5, -3};
        
        kadnes(nums);
    }
}
