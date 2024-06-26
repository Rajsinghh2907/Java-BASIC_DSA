package functions_or_method;

import java.util.Scanner;

public class prime_number_range {
    public static boolean isPrime(int n) {
        boolean isprime = true;
        for(int i = 2; i<=Math.sqrt(n); i++ ){
           if(n % i == 0) {
             return false;
            }
        }
        return isprime;
    }

    public static void  PrimeRange(int n){
        for(int i = 2 ; i<n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mumber to finf range of prime number ");
        int n = sc.nextInt();
        //isPrime(n);
        PrimeRange(n);
        sc.close();
    }
    
}
