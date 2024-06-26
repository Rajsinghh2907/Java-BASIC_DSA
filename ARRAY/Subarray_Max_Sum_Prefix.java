package ARRAY;

public class Subarray_Max_Sum_Prefix {

    public static int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int[nums.length];

        prefix[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){

                // currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1]; // Same is written as below help of ternary operator

                if(i == 0){
                    currsum = prefix[j];
                } else{

                currsum = prefix[j] - prefix[i-1];
                }
                
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
          
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};


       System.out.println(maxSubArray(num));
    }
} 

