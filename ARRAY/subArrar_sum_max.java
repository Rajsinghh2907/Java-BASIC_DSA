package ARRAY;

public class subArrar_sum_max {
    public static void MaxsubarraySum(int num[]){
        int currsum= 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i<num.length; i++){
            for(int j = i ; j<num.length; j++){ 
                
                currsum = 0; // we have again intialize the currsum

                 for(int k = i ; k<=j; k++){       // we also write k = start and k<=end by i =start and k =end
                    
                    currsum = currsum + num[k];
               }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
            System.out.println();

        }
        System.out.println("max sum is : " + maxsum);
       
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        MaxsubarraySum(num);
    }
    
}


