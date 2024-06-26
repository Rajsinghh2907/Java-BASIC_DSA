package ARRAY;

public class print_subArray {
    public static void subarray(int num[]){
        int ts = 0;
        for(int i = 0; i<num.length; i++){
            
            for(int j = i; j<num.length; j++){
                
                for(int k = i; k<=j; k++){
                    System.out.print(num[k] + " ");
                }
                ts++;
               
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total subarray is " + ts);
        
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        subarray(num);
    }
    
}
