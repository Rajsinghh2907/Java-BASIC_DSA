package functions_or_method;
import java.util.*;

public class binomial_coeffiient {

    public static int factorial(int n ) {
        int f =1;
        for(int i = 1; i<=n; i++){
            f = f*i;
            
        }
        return f;
    }

    public static int binomialcoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nminusr = factorial(n-r);

        int binocoeff = fact_n / (fact_r * fact_nminusr);
        return binocoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two number to find binomial coeff.  nCr");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int bicoeff = binomialcoeff(n,r);
        System.out.println(bicoeff);
        sc.close();
    }
    
}
