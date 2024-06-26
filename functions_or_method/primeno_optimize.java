package functions_or_method;
import java.util.*;

public class primeno_optimize {
    public static boolean isPrime(int n) {
        boolean isprime = true;
        for(int i = 2; i<=Math.sqrt(n); i++ ){
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
        if(isPrime(n) == true){
            System.out.println("Prime number");
        }else{
            System.out.println("Not");
        }
        //System.out.println(isPrime(n));
        sc.close();
    }
    
}

