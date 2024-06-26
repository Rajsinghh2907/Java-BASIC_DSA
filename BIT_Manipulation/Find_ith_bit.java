package BIT_Manipulation;

public class Find_ith_bit {
    public static int GetIthbits(int n,int i) {
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println(GetIthbits(5,2));

        // if(GetIthbits(5,2)== 0){
        //     System.out.println(" it return 0");
        // }else{
        //     System.out.println("return 1");
        // }
        
    }
    
}
