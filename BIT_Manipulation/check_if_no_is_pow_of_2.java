package BIT_Manipulation;

public class check_if_no_is_pow_of_2 {
    
    public static boolean checkNo(int n){
        return ( n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(checkNo(32));
    }
}
