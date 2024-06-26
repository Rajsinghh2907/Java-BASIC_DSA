package functions_or_method;
import java.util.*;

public class prime_no_usng_fn {

    public static boolean isPrime(int n) {
        boolean isprime = true;
        for(int i = 2; i<=n-1; i++ ){
           if(n % i == 0) {
             return false;
            }
        }
        return isprime;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mumber to find it is prime or not ");
        int n = sc.nextInt();
        isPrime(n);
        System.out.println(isPrime(n));
        sc.close();
    }
    
}
