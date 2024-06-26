package BIT_Manipulation;

public class check_even_odd_binary {
    public static void CheckEvenOdd (int n){
        int bitmass = 1;
        if((n & bitmass ) == 0){
            System.out.println("even Number");
        }else{
            System.out.println("Odd Number");
        }
        
    }
    public static void main(String[] args) {

        CheckEvenOdd(3);     
        CheckEvenOdd(4);    
        CheckEvenOdd(7);    
        CheckEvenOdd(5); 
        CheckEvenOdd(8);          
    }
    
}
